package Factoria.Ejercicio2;

public class FactoriaFactura {
    public static Factura ObtenerFactura(String tipoFactura){
        if (tipoFactura == null){
            throw new IllegalArgumentException("Tipo de factura es null y no puede instanciarse ninguna de las facturas definidas.");
        }
        if (tipoFactura.toLowerCase() == "normal"){
            return new Normal();
        }else if (tipoFactura.toLowerCase() == "especial"){
            return new Especial();
        }else{
            throw new IllegalArgumentException("Tipo de factura no valida");
        }
    }
}
