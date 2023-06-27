package Factoria.Ejercicio2;

public abstract class Factura {
    // Atributos
    protected int iva;

    // Metodo
    public void construirFactura(){
        System.out.println("A la factura se le agregara " + this.iva + "% de iva");
    }
}
