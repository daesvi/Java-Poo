package composicion_agregacion.taller_uno.composicion;

public class Casa {
    // Atributos
    private Habitacion[] habitaciones;
    private int cantHabitaciones;
    private static int CAPACIDAD_MAXIMA = 100;

    // Constructor
    public Casa(){
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantHabitaciones = 0;
    }

    // Getters
    public Habitacion[] getHabitaciones() {return habitaciones;}
    public int getCantHabitaciones() {return cantHabitaciones;}

    // Metodos
    public void agregarHabitacion(Habitacion habitacion){
        if (this.cantHabitaciones <= this.habitaciones.length){
            this.habitaciones[cantHabitaciones] = habitacion;
            cantHabitaciones++;
        }else {
            System.out.println("Limite de habitaciones alcanzado");
        }
    }

    public void destruirCasa(){
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantHabitaciones = 0;
        System.out.println("Las habitaciones de la casa han sido destruidas");
    }

    public void mostrarInformacionCasa(){
        for (int i = 0; i < cantHabitaciones;i++){
            Habitacion habitacion = habitaciones[i];
            System.out.println("Habitacion "+(i+1)+": ");
            System.out.println("Numero habitacion: "+habitacion.getNumHabitacion());
            System.out.println("Tamaño habitacion: "+habitacion.getTamanoHabitacion());
        }
    }
}
