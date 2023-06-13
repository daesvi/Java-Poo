package herencia;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println("Empleado 1");
        empleado.mostrarInformacion();
        System.out.println("Empleado 2");
        Empleado empleado2 = new Empleado("Camilo", "calle 82", "302","Supervisor", 2000000);
        empleado2.mostrarInformacion();
    }
}
