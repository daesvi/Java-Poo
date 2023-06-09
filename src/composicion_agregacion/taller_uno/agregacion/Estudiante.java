package composicion_agregacion.taller_uno.agregacion;

public class Estudiante {
    // Atributos
    String nombre;
    int edad;
    int ID;

    // Constructor
    Estudiante(String nombre, int edad, int ID){
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
    }

    // Getters y Setters
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public int getID() {return ID;}
}
