package herencia;

public class Empleado extends Persona{
    // Atributos
    private String cargo;
    private double sueldo;

    // Constructor
    public Empleado() {
        this.cargo = "cargo por defecto";
        this.sueldo = 1160000;
    }
    public Empleado(String nombre, String direccion, String telefono, String cargo, double sueldo) {
        super(nombre, direccion, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Seterrs
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public double getSueldo() {return sueldo;}
    public void setSueldo(double sueldo) {this.sueldo = sueldo;}

    public void mostrarInformacion(){
        System.out.println("Cargo: " + getCargo() + "\nNombre: "+ getNombre() + "\nSueldo: " +getSueldo() + "\nDireccion: " +getDireccion() + "\nTelefono: " + getTelefono());
    }
}
