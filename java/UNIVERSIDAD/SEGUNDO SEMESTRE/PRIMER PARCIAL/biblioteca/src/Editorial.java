public class Editorial {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String ciudad;

    public Editorial(int id, String nombre, String direccion, String telefono, String ciudad) {
        this.id = id;
        this.nombre=nombre;
        this.direccion =direccion;
        this.telefono=telefono;
        this.ciudad=ciudad;
    }

    public int getId() {


        return id;
    }

    public void setId() {
        this.id = id;
    }
}
