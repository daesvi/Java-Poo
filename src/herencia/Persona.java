package herencia;

public class Persona {
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public Persona(){
        this.nombre = "Daniel";
        this.direccion = "Por defecto";
        this.telefono = "123456";
    }
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
