import java.util.ArrayList;
import java.util.Scanner;//importar entrada de datos

public class TestBiblioteca {
    public static Autor[] autores = new Autor[10];
    //El ArrayList se utiliza para que nosotros podamos tener mejor interaccion con nuestro lista
    public static ArrayList<Autor> lista = new ArrayList<Autor>();
    static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Integer> lista2 = new ArrayList<>();//para probar como funciona
    public static int pos = 0;


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        //  Autor autor = new Autor(1,"alex","Antonio","Angel","oaxaca");
        //Autor autor2 = new Autor(2, "Isaac", "Perez", "Campo", "Oaxaca");
        int[] numero = {1, 2, 3};
        int op, i, id;
        int index;
        boolean condition = true;


        //int pos = 0;


//Valores por Default
     /*   System.out.println("Autor1");
        System.out.println("id: " + autor1.id);
        System.out.println("Nombre: " + autor1.nombre);
        System.out.println("");
//Valores constantes
        System.out.println("Autor2");
        System.out.println("id: " + autor2.id);
        System.out.println("Nombre: " + autor2.nombre);
//Valores dados por Usuario
*/

        //  System.out.println("id: " + autor3.id);
        // System.out.println("Nombre: " + autor3.nombre + " " + autor3.aPaterno + " " + autor3.aMaterno);

        //System.out.println("Ciudad: " + autor3.ciudad);


        do {

            // System.out.println(lista2);
            for (i = 0; i < lista.size(); i++)

                autores[i] = lista.get(i);
            Autor a;

            //System.out.println(lista);
            System.out.println("**********BIBLIOTECA******");
            System.out.println("1.- Agregar");
            System.out.println("2.- Buscar");
            System.out.println("3.- Listar");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Modificar");

            System.out.println("0.- Salir");

            op = lector.nextInt();//agregar texto

            switch (op) {

                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("AGREGAR NUEVO AUTOR:");
                    if (pos < 10 && autores[pos] == null) {
                        autores[pos] = registrarAutor(pos, true);


                        // lista2.add(numero[pos]);

                        //lista.add(autores[pos]);


                    } else {
                        System.out.println("Ya tienes registrado a un autor");
                    }

                    break;


                case 2:
                    System.out.println("BUSCAR AUTOR:");
                    System.out.println("");
                    System.out.println("Agregar id del autor del 0 al 9");
                    id = lector.nextInt();
                    //Se va directamente con el metodo buscar autor y manda 1 0 -1
                    index = BuscarAutor(id, 1, false);
                    //Si es -1 entonces significa que no tiene nada registrado en ese autor
                    if (index == -1) {

                        System.out.println("No se encontro el autor solicitado...Se agregaran nuevos dato de casilla vacía");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                        autores[pos] = registrarAutor(id, false);

                    }
                    break;

                case 3:
                    System.out.println("LISTAR AUTORES");
                    for (i = 0; i < lista.size(); i++) {

                        System.out.println("id: " + lista.get(i).id);
                        System.out.println("Nombre: " + lista.get(i).nombre + " " + lista.get(i).aPaterno + " " + lista.get(i).aMaterno);


                    }

                    if (lista.isEmpty()) System.out.println("***LA LISTA ESTA VACÍA*****");
                    break;

                case 4:
                    System.out.println("ELIMINAR AUTOR");
                    System.out.println("Agregar id del autor del 0 al 9");
                    id = lector.nextInt();
                    index = EliminarAutor(id, 2, false);
                    break;
                case 5:
                    System.out.println("MODIFICAR AUTOR");
                    System.out.println("Agregar id del autor del 0 al 9");
                    id = lector.nextInt();
                    index = ModificarAutor(id, 2, true);
                    break;
                default:
                    System.out.println("VALORES INCORRECTOS.. INTENTA NUEVAMENTE..");
                    break;
            }
            //  pos++;
        } while (op != 0);


    }

    public static Autor registrarAutor(int n, boolean opc) {
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        int id;


        String nombre;
        String aPaterno;
        String aMaterno;
        String ciudad;

        id = n;
        System.out.println("ID: " + id);

        System.out.println("Nombre: ");
        nombre = lector.next();//.Entrada de..
        System.out.println("Apellido Paterno: ");
        aPaterno = lector.next();//.Entrada de..
        System.out.println("Apellido Materno: ");
        aMaterno = lector.next();//.Entrada de..
        System.out.println("Ciudad: ");
        ciudad = lector.next();//.Entrada de..

        Autor autor = new Autor(id, nombre, aPaterno, aMaterno, ciudad);
        // lista.add(autor);

        System.out.println("AUTOR REGISTRADO..");
        if (opc) pos++;
        lista.add(autor);
        return autor;

    }

    //Este metodo sirve para que pueda hacer la busqueda del id, se utilizara demasiado.
    public static int OperacionBusqueda(int id, int opc, boolean n) {
        Scanner lector = new Scanner(System.in);
        int i;
        for (i = 0; i < 9; i++) {
            //comparamos si autores es nulo si es asi no lee el array y no genera ERROR
            if (autores[i] != null && autores[i].id == id) {
                //
                //System.out.println(lista2.contains(i));
                System.out.println("autores= id: " + autores[i].id);


                System.out.println("autores= Nombre: " + autores[i].nombre + " " + autores[i].aPaterno + " " + autores[i].aMaterno);

                //regresa 1 para dar a entender que se ejecuto y no necesita nada mas
                if (opc == 2) {
                    System.out.println("¿Deseas eliminar al autor seleccionado? y=1/n=0");
                    int desicion = lector.nextInt();
                    if (desicion == 1) {
                        lista.remove(i);
                       // autores[i] = lista.get(i);

                    }

                    if (n) {
                        System.out.println("MODIFICACION DE AUTOR");
                        autores[i] = registrarAutor(i, false);
                    }// else pos--;

                }
                return 1;

            }
        }


        //NUNCA LEYO EL autores[] porque no tiene nada registrado
        return -1;

    }

    public static int BuscarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }

    public static int EliminarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }

    public static int ModificarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }


}


