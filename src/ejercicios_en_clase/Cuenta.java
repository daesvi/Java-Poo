package ejercicios_en_clase;

import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreTitular;
    private  long numeroDeCuenta;

    public Cuenta(double saldoDeCuenta, String nombreTitular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreTitular = nombreTitular;
        this.numeroDeCuenta = generarNumeroCuenta();
    }

    public void setIngreso(double ingreso){saldoDeCuenta += ingreso;}
    public void setRetiro(double retiro){
        if (saldoDeCuenta >= retiro) {
            saldoDeCuenta -= retiro;
        }else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double getSaldoDeCuenta(){return saldoDeCuenta;}
    public String getDatosCuenta(){
        return "Titular: " + nombreTitular + "\nSaldo: " + saldoDeCuenta + "\nNumero de cuenta: " + numeroDeCuenta;
    }
    private long generarNumeroCuenta(){
        Random random = new Random();
        return Math.abs(random.nextLong());
    }
}