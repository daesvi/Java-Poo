package composicion_agregacion.taller_uno.composicion;

public class Main {
    public static void main(String[] args) {
        // Crea instancia de casa
        Casa casa = new Casa();

        // Crea instancias de habitacion
        Habitacion habitacion1 = new Habitacion(1,30.23);
        Habitacion habitacion2 = new Habitacion(2,40.14);

        // Agrega las habitaciones a la casa
        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);

        // Muestra la informacion de la casa
        casa.mostrarInformacionCasa();

        // Destruye las habitaciones de la casa
        casa.destruirCasa();

        // Muestra la informacion de la casa para comprobar que se eliminaron las habitaciones
        casa.mostrarInformacionCasa();
    }
}
