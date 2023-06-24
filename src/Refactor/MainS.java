package Refactor;

public class MainS {
    public static void main(String[] args) {
        Carro carro = new Carro(70);
        Camion camion = new Camion(300);
        Mula mula = new Mula(80);

        System.out.println("En caso de carro con velocidad 70");
        carro.construirFotoMulta();
        System.out.println("En caso de Camion con velocidad 300");
        camion.construirFotoMulta();
        System.out.println("En caso de Mula con velocidad 40");
        mula.construirFotoMulta();
    }
}
