package taller_uno.segundo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia objetos de la clase Jugador
        Jugador juan = new Jugador("Juan", "3005876543", "Calle 90 # 67 - 32");
        Jugador pedro = new Jugador("Pedro", "3019876543", "Carrera 4 # 104 - 92");
        Jugador sebastian = new Jugador("Sebastian", "3012345678", "Calle 43 # 2 - 103");
        Jugador camilo = new Jugador("Camilo", "3028759032", "Carrera 88 # 3 - 4");

        // Crea el primer equipo - instancia objeto de la clase EquipoFutbol
        EquipoFutbol equipo1 = new EquipoFutbol("Estrellas del norte", "Cali", new ArrayList<>());
        equipo1.agregarJugador(juan);
        equipo1.agregarJugador(pedro);
        equipo1.mostrarInformacion();

        // Crea el segundo equipo - instancia objeto de la clase EquipoFutbol
        EquipoFutbol equipo2 = new EquipoFutbol("Tigres", "Bogotá", new ArrayList<>());
        equipo2.agregarJugador(sebastian);
        equipo2.agregarJugador(camilo);
        equipo2.mostrarInformacion();
    }
}
