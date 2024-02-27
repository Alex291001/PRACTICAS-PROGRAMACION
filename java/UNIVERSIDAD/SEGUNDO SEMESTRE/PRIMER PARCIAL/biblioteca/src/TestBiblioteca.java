import java.util.ArrayList;
import java.util.Scanner;//importar entrada de datos

public class TestBiblioteca {
    public  static Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
    // public static Autor[] autores = new Autor[10];
    //El ArrayList se utiliza para que nosotros podamos tener mejor interaccion con nuestro lista
    public static ArrayList<Autor> Autores = new ArrayList<Autor>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Editorial> Editoriales = new ArrayList<>();
    //public static ArrayList<Integer> lista2 = new ArrayList<>();//para probar como funciona
    public static int pos = 0;



    public static void main(String[] args) {

        int op, i, id;
        int index, indexEdit = 0, elimEdit;
        String nombreEdit, direccionEdit, telefonoEdit, ciudadEdit;
        int idEdit;
        Editorial edit = new Editorial();

        Autor autor1 = new Autor(0, "Gabriel", "Garcia", "Marquez", "CiudadMexico");
        Autor autor2 = new Autor(1, "Haruki", "Murakami", "Murakami", "Japon");
        Autor autor3 = new Autor(2, "Joanne", "Rowling", "Rowling", "Escocia");
        Autor autor4 = new Autor(3, "Paulo", "Coelho", "Souza", "Janeiro");
        Autor autor5 = new Autor(4, "Sthephen", "Edwin", "King", "Bangor");

        Autores.add(autor1);
        Autores.add(autor2);
        Autores.add(autor3);
        Autores.add(autor4);
        Autores.add(autor5);


        Editorial editorial1 = new Editorial(0, "Sudamerica", "Buenos aires", "1231231", "Argentina");
        Editorial editorial2 = new Editorial(1, "Tusquets", "Barcelona", "520232032", "España");
        Editorial editorial3 = new Editorial(2, "Bloomsbury", "Londres", "5201923102", "Reino Unido");
        Editorial editorial4 = new Editorial(3, "Planeta", "Nueva York", "331298379", "USA");
        Editorial editorial5 = new Editorial(4, "Viking", "sanMatias", "331230022", "NuevaYork");

        Editoriales.add(editorial1);
        Editoriales.add(editorial2);
        Editoriales.add(editorial3);
        Editoriales.add(editorial4);
        Editoriales.add(editorial5);


        Autor a;
        Libro c;
        do {


            //System.out.println(lista);
            System.out.println("**********BIBLIOTECA******");
           /* System.out.println("1.- Agregar");
            System.out.println("2.- Buscar");
            System.out.println("3.- Listar");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Modificar");*/
            System.out.println("1.- Agregar Autor");
            System.out.println("2.- Agregar Editorial");
            System.out.println("3.- Agregar Libro");
            System.out.println("4.- Buscar Autor");
            System.out.println("5.- Buscar Editorial");
            System.out.println("6.- Buscar Libro");
            System.out.println("7.- Modificar Libro");
            System.out.println("8.- Modificar Editorial");
            System.out.println("9.- Modificar Autor");
            System.out.println("10.-Eliminar Libro");
            System.out.println("11.-Eliminar Editorial");
            System.out.println("12.-Eliminar Autor");
            System.out.println("0.- Salir");

            op = lector.nextInt();//agregar texto

            switch (op) {

                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("AGREGAR NUEVO AUTOR:");
                    a = registrarAutor();
                    if (a != null) {

                        Autores.add(a);

                    } else {
                        System.out.println("Ya tienes registrado a un autor");
                    }

                    break;


                case 2:

                    System.out.println("AGREGAR EDITORIAL:");
                    System.out.println("ID: ");
                    idEdit = lector.nextInt();
                    System.out.println("Nombre: ");
                    nombreEdit = lector.next();//.Entrada de..
                    System.out.println("Direccion: ");
                    direccionEdit = lector.next();//.Entrada de..
                    System.out.println("Telefono: ");
                    telefonoEdit = lector.next();//.Entrada de..
                    System.out.println("Ciudad: ");
                    ciudadEdit = lector.next();//.Entrada de..
                    edit.setId(idEdit);
                    edit.setNombre(nombreEdit);
                    edit.setDireccion(direccionEdit);
                    edit.setTelefono(telefonoEdit);
                    edit.setCiudad(ciudadEdit);
                    Editoriales.add(edit);


                    break;

                case 3://AGREGAR LIBRO
                    c= RegistrarLibro();
                    if (c!=null)libros.add(c);
                        else {
                            System.out.println("No se pudo registrar el Libro");
                    }

                   /* System.out.println("LISTAR AUTORES");

                    for (Autor n : lista) {
                       System.out.println(lista.size());
                        System.out.println("id: " + n.id);
                        System.out.println("Nombre: " + n.nombre + " " + n.aPaterno + " " + n.aMaterno);


            }

            if (lista.isEmpty()) System.out.println("***LA LISTA ESTA VACÍA*****");*/



                    break;

                case 4:
                    System.out.println("4 BUSCAR AUTOR:");
                    System.out.println("");
                    System.out.println("Agregar id del autor");
                    id = lector.nextInt();
                    //Se va directamente con el metodo buscar autor y manda 1 0 -1
                 if( BuscarAutor(id, 1, false)==null) {

                        System.out.println("No se encontro el autor solicitado...Se agregaran nuevos dato de casilla vacía");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                        a = registrarAutor();

                    }
                    break;
                case 5:

                    System.out.println(" BUSCAR EDITORIAL:");
                    System.out.println("");
                    System.out.println("Agregar id del EDITORIAL");
                    id = lector.nextInt();
                    //edit=BuscarEditorial(id,0);
                    if((edit=BuscarEditorial(id))==null){
                        System.out.println("No se encontro el Editorial solicitado...Se agregaran nuevos dato de casilla vacía");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                    }

                    //Se va directamente con el metodo buscar autor y manda 1 0 -1

                    //Si es -1 entonces significa que no tiene nada registrado en ese autor


                    break;
                default:
                    System.out.println("VALORES INCORRECTOS.. INTENTA NUEVAMENTE..");

                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("MODIFICAR EDITORIAL");
                    System.out.println("Agrega el id del editorial");
                    id = lector.nextInt();


                    for (Editorial n : Editoriales) {
                        if (id == n.getId() && n != null) {
                            System.out.println("ID " + n.getId());
                            System.out.println("Nombre: " + n.getNombre());
                            System.out.println("Direccion " + n.getDireccion());
                            System.out.println("Telefono " + n.getTelefono());
                            System.out.println("Ciudad " + n.getCiudad());
                            System.out.println("Deseas modificar el Editorial? 1)Y 0)N");
                            elimEdit = lector.nextInt();

                            if (elimEdit == 1) {

                                System.out.println("AGREGAR EDITORIAL:");
                                System.out.println("ID: ");
                                idEdit = lector.nextInt();
                                System.out.println("Nombre: ");
                                nombreEdit = lector.next();//.Entrada de..
                                System.out.println("Direccion: ");
                                direccionEdit = lector.next();//.Entrada de..
                                System.out.println("Telefono: ");
                                telefonoEdit = lector.next();//.Entrada de..
                                System.out.println("Ciudad: ");
                                ciudadEdit = lector.next();//.Entrada de..
                                n.setId(idEdit);
                                n.setNombre(nombreEdit);
                                n.setDireccion(direccionEdit);
                                n.setTelefono(telefonoEdit);
                                n.setCiudad(ciudadEdit);
                                //Editoriales.add(edit1);
                            }

                            indexEdit = 1;

                        }
                    }
                    //Se va directamente con el metodo buscar autor y manda 1 0 -1

                    //Si es -1 entonces significa que no tiene nada registrado en ese autor
                    if (indexEdit == 0) {

                        System.out.println("No se encontro el Editorial solicitado...Se agregaran nuevos dato de casilla vacía");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                    }


                    break;
                case 9:
                    System.out.println("MODIFICAR AUTOR");
                    System.out.println("Agregar id del autor");
                    id = lector.nextInt();
                    a = ModificarAutor(id, 2, true);

                    break;
                case 10:
                    break;
                case 11:
                    System.out.println("ELIMINAR EDITORIAL");
                    System.out.println("Agrega el id del editorial");
                    id = lector.nextInt();
                    for (Editorial n : Editoriales) {
                        if (id == n.getId() && n != null) {
                            System.out.println("ID " + n.getId());
                            System.out.println("Nombre: " + n.getNombre());
                            System.out.println("Direccion " + n.getDireccion());
                            System.out.println("Telefono " + n.getTelefono());
                            System.out.println("Ciudad " + n.getCiudad());
                            System.out.println("Deseas Eliminar el Editorial? 1)Y 0)N");
                            elimEdit = lector.nextInt();

                            if (elimEdit == 1) Editoriales.remove(n);

                            indexEdit = 1;

                        }
                    }
                    //Se va directamente con el metodo buscar autor y manda 1 0 -1

                    //Si es -1 entonces significa que no tiene nada registrado en ese autor
                    if (indexEdit == 0) {

                        System.out.println("No se encontro el Editorial solicitado...Se agregaran nuevos dato de casilla vacía");
                        System.out.println("");
                        System.out.println("Inserta nuevos datos");
                    }

                    break;
                case 12:
                    System.out.println("ELIMINAR AUTOR");
                    System.out.println("Agregar id del autor del 0 al 9");
                    id = lector.nextInt();
                    a = EliminarAutor(id, 2, false);
                    break;
                case 13:
                    System.out.println("LISTAR AUTORES");

                    for (Autor n : Autores) {
                        //System.out.println(Autores.size());
                        System.out.println("id: " + n.id);
                        System.out.println("Nombre: " + n.nombre + " " + n.aPaterno + " " + n.aMaterno);
                    }
                    break;

            }
            //  pos++;
        } while (op != 0);


    }




    public static Autor registrarAutor() {
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        int id;


        String nombre;
        String aPaterno;
        String aMaterno;
        String ciudad;

        //id = n;
        System.out.println("ID: ");
        id = lector.nextInt();
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
        // if (opc) pos++;
        //lista.add(autor);
        return autor;

    }

    //Este metodo sirve para que pueda hacer la busqueda del id, se utilizara demasiado.
    public static Autor OperacionBusqueda(int id, int opc, boolean n) {
        Scanner lector = new Scanner(System.in);
        int i;
        Autor a;
        for (Autor m : Autores) {
            //a=lista.get(i);
            //comparamos si autores es nulo si es asi no lee el array y no genera ERROR
            if (m != null && m.id == id) {
                //
                //System.out.println(lista2.contains(i));
                System.out.println("autores= id: " + m.getId());


                System.out.println("autores= Nombre: " + m.getNombre() + " " + m.getaPaterno() + " " + m.getaMaterno());
                System.out.println("Ciudad: " + m.getCiudad());

                //regresa 1 para dar a entender que se ejecuto y no necesita nada mas
                if (opc == 2) {
                    System.out.println("¿Deseas eliminar al autor seleccionado? y=1/n=0");
                    int desicion = lector.nextInt();
                    if (desicion == 1) {
                        Autores.remove(m);

                        if (n) {
                            m = registrarAutor();

                            Autores.add(m);

                        }
                        // autores[i] = lista.get(i);

                    }


                }
                return m;

            }
        }


        //NUNCA LEYO EL autores[] porque no tiene nada registrado
        return null;

    }




    public static Autor BuscarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }

    public static Autor EliminarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }

    public static Autor ModificarAutor(int id, int opc, boolean n) {
//Se manda al metodo OperacionBusqueda que es el cual realiza todo el movimiento y es sumamente reutilizable
        return OperacionBusqueda(id, opc, n);

    }
    public static Editorial BuscarEditorial(int id){

        for (Editorial i : Editoriales) {
            if (id == i.getId() && i != null) {
                System.out.println("ID " + i.getId());
                System.out.println("Nombre: " + i.getNombre());
                System.out.println("Direccion " + i.getDireccion());
                System.out.println("Telefono " + i.getTelefono());
                System.out.println("Ciudad " + i.getCiudad());


                return i;


            }
        }

return null;
    }


    public static Libro RegistrarLibro(){
        Scanner lector = new Scanner(System.in);//Entrada de datos desde el teclado
        int isbn,opc=1;
        String titulo;
        String edicion;
        String genero;
        Editorial editorial;
        ArrayList<Autor> autores= new ArrayList<>();
        System.out.println("ISBN ");
        isbn =lector.nextInt();
        System.out.println("Titulo");
        titulo=lector.next();
        System.out.println("edicion");
        edicion=lector.next();
        System.out.println("Genero");
        genero=lector.next();
        System.out.println("ID de editorial");
        int idEditorial= lector.nextInt();
        editorial = BuscarEditorial(idEditorial);
        System.out.println("Introduce el id del autor");
        int idAutores;
        while (opc!=0){
        idAutores =lector.nextInt();
        Autores.add(BuscarAutor(idAutores,1,false));
            System.out.println("Existen mas autores? 0)NO 1)SI");
        }





        Libro libro = new Libro(isbn,titulo,edicion,genero,editorial,autores);


        return libro;
    }

}




