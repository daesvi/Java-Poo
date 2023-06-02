package taller_uno.segundo;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    // Atributos
    private static int contador = 0;
    private int id;
    private String nombre;
    private String ciudad;
    private List<Jugador> jugadores;

    // Constructor
    EquipoFutbol(String nombre, String ciudad, List<Jugador> jugadores){
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    // Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public List<Jugador> getJugadores() {return jugadores;}
    public void setJugadores(List<Jugador> jugadores) {this.jugadores = jugadores;}

    // Metodos
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarInformacion(){
        System.out.println("************************************");
        System.out.println("   Información sobre el equipo " + id);
        System.out.println("************************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Jugadores: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(i+1 + ".");
            System.out.println(" Nombre: " + jugadores.get(i).getNombre());
            System.out.println(" Teléfono: " + jugadores.get(i).getTelefono());
            System.out.println(" Dirección: " + jugadores.get(i).getDireccion());
            System.out.println("------------------------------------");
        }
    }
}
