package interfaces;

public class Cuadrado implements Figura, Dibujable{
    private double lado;
    public Cuadrado() {
        this.lado = 4;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Lado: " + lado);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}
