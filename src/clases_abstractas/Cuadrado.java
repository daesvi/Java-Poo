package clases_abstractas;
public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
        this.lado = 4;
        this.x = 2;
        this.yy = 5;
    }

    public Cuadrado(double x, double yy, double lado) {
        super(x, yy);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Posicion X: " + x + "\nPosicion Y: " + yy + "\nLado: " + lado);
    }
}
