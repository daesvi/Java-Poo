package clases_abstractas;

public class Circulo extends Figura{
    private double radio;
    public Circulo() {
        this.radio = 3.2;
        this.x = 4;
        this.yy = 2;
    }

    public Circulo(double x, double yy, double radio) {
        super(x, yy);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (radio*radio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Posicion X: " + x + "\nPosicion Y: " + yy + "\nRadio: " + radio);
    }
}
