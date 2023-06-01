package taller_uno;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primer objeto
        Carro carro1 = new Carro("Chevrolet","Blazer RS",2021,"Blanco");
        // Cambio atributo Color con el metodo set
        carro1.setColor("Negro");
        // Llama los metodos indicados en el ejercicio
        carro1.acelerar();
        carro1.frenar();
        System.out.println("Ingrese 1 para girar a la izquierda o 2 para girar a la derecha");
        carro1.girar(sc.nextInt());
        carro1.mostrarInformacion();

        System.out.println("*****************************");

        // Segundo objeto
        Carro carro2 = new Carro("BMW","M4 Competition",2022,"Negro");
        // Cambio atributo Color con el metodo set
        carro2.setColor("Azul");
        // Llama los metodos indicados en el ejercicio
        carro2.acelerar();
        carro2.frenar();
        System.out.println("Ingrese 1 para girar a la izquierda o 2 para girar a la derecha");
        carro2.girar(sc.nextInt());
        carro2.mostrarInformacion();
    }
}
