package clases_abstractas;

public abstract class Figura {
    // Atributos
    protected double x;
    protected double yy;

    protected Figura(){};
    protected Figura(double x, double yy){
        this.x = x;
        this.yy = yy;
    };
    public abstract double calcularArea();
    public abstract void mostrarInformacion();
}
