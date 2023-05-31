package ejercicios_en_clase;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(10000, "Daniel");
        cuenta.setIngreso(10000);
        cuenta.setRetiro(5000);
        System.out.println(cuenta.getDatosCuenta());
    }
}