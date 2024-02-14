import javax.lang.model.type.NullType;
import java.util.Scanner;//importar entrada de datos

public class TestBiblioteca {
    public static Autor[] autores = new Autor[10];
    public static int pos = 0;


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        // Autor autor1 = new Autor();
        //  Autor autor2 = new Autor(1, "Isaac", "Perez", "Campo", "Oaxaca");
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
            System.out.println("**********BIBLIOTECA*****8");
            System.out.println("1.- Agregar");
            System.out.println("2.- Buscar");
            System.out.println("3.- Listar");
            System.out.println("4.- Eliminar");
            System.out.println("0.- Salir");

            op = lector.nextInt();//agregar texto

            switch (op) {
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("AGREGAR NUEVO AUTOR:");
                    if (pos < 10 && autores[pos] == null) {
                        autores[pos] = registrarAutor(pos);

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
                    index = BuscarAutor(id, 1);
                    //Si es -1 entonces significa que no tiene nada registrado en ese autor
                    if (index == -1) {

                        System.out.println("No se encontro el autor solicitado...");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                        autores[pos] = registrarAutor(pos);

                    }
                    break;

                case 3:
                    System.out.println("LISTAR AUTORES");
                    for (i = 0; i < 10; i++) {
                        if (autores[i] != null) {
                            System.out.println("id: " + autores[i].id);
                            System.out.println("Nombre: " + autores[i].nombre + " " + autores[i].aPaterno + " " + autores[i].aMaterno);
                            condition = false;
                        }

                    }

                    if (condition) System.out.println("***LA LISTA ESTA VACÍA*****");
                    break;

                case 4:
                    System.out.println("ELIMINAR AUTOR");
                    System.out.println("Agregar id del autor del 0 al 9");
                    id = lector.nextInt();
                    index = BuscarAutor(id, 2);
                    break;
                default:
                    System.out.println("VALORES INCORRECTOS.. INTENTA NUEVAMENTE..");
                    break;
            }
            //  pos++;
        } while (op != 0);


    }

    public static Autor registrarAutor(int n) {
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        int id;
        pos++;
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

        System.out.println("AUTOR REGISTRADO..");

        return autor;

    }

    //Este metodo sirve para que pueda hacer la busqueda del id, se utilizara demasiado.
    public static int OperacionBusqueda(int id,int opc){

        int i;
        for (i = 0; i < 9; i++) {
            //comparamos si autores es nulo si es asi no lee el array y no genera ERROR
            if (autores[i] != null && autores[i].id == id) {
                //

                System.out.println("id: " + autores[i].id);

                System.out.println("Nombre: " + autores[i].nombre + " " + autores[i].aPaterno + " " + autores[i].aMaterno);
                //regresa 1 para dar a entender que se ejecuto y no necesita nada mas
                if (opc == 2) {
                    System.out.println("¿Deseas eliminar al autor? y/n");

                }
                return 1;

            }
        }


        //NUNCA LEYO EL autores[] porque no tiene nada registrado
        return -1;

    }

    public static int BuscarAutor(int id, int opc) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
       return OperacionBusqueda(id,opc);

    }


}


