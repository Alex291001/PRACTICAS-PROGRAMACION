public class Autor {


    int id;//
    String nombre;
    String aPaterno;
    String aMaterno;
    String ciudad;


    public Autor(int id, String nombre, String aPaterno, String aMaterno, String ciudad) {

        this.id = id;//los this se utiliza para hacer el llamado fild
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.ciudad = ciudad;
    }


    public Autor() {

    }
}