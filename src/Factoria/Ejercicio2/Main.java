package Factoria.Ejercicio2;

import Factoria.Profesor.FactoriaFigura;

public class Main {
    public static void main(String[] args) {
        Factura factura = FactoriaFactura.ObtenerFactura("normal");
        factura.construirFactura();
        Factura factura2 = FactoriaFactura.ObtenerFactura("especial");
        factura2.construirFactura();
        Factura factura3 = FactoriaFactura.ObtenerFactura("sdsad");
        factura3.construirFactura();
    }
}
