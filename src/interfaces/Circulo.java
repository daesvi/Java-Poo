package interfaces;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;
    public Circulo() {
        this.radio = 3.2;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (radio*radio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Radio: " + radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el circulo");
    }
}
