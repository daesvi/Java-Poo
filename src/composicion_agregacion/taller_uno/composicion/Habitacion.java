package composicion_agregacion.taller_uno.composicion;

public class Habitacion {
    // Atributos
    private int numHabitacion;
    private double tamanoHabitacion;

    // Constructor
    Habitacion(int numHabitacion, double tamanoHabitacion){
        this.numHabitacion = numHabitacion;
        this.tamanoHabitacion = tamanoHabitacion;
    }

    // Getters y Setters

    public int getNumHabitacion() {return numHabitacion;}
    public double getTamanoHabitacion() {return tamanoHabitacion;}
}
