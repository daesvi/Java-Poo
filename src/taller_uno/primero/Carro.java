package taller_uno.primero;

import java.util.Scanner;
public class Carro {
    // Atributos
    private static int contador = 0;
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor
    public Carro(String marca, String modelo, int anio, String color){
        // Se usa un contador, ya que si se asigna sobre el mismo id, todas las instancias van a tener el mismo valor
        contador++;
        this.id = contador;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    // Getters y Setters
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public int getAnio(){return anio;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    // Metodos
    public void acelerar(){
        System.out.println("El carro está acelerando");
    }

    public void frenar(){
        System.out.println("El carro está frenando");
    }

    public void girar(int direccion) {
        if (direccion == 1) {
            System.out.println("Girando hacia la izquierda");
        } else if (direccion==2){
            System.out.println("Girando hacia la derecha");
        }else {
            // Para controlar que no ingrese un número no válido
            System.out.println("Direccion incorrecta, ingrese de nuevo. 1 para izquierda, 2 para derecha");
            Scanner sc = new Scanner(System.in);
            // Se llama asi mismo para evaluar de nuevo, creando una especie de ciclo
            girar(sc.nextInt());
        }
    }

    public void mostrarInformacion(){
        System.out.println("Información del carro #"+id +"\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\nColor: " + color);
    }
}
