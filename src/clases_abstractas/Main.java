package clases_abstractas;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        System.out.println("Informacion cuadrado");
        cuadrado.mostrarInformacion();
        System.out.println("Area cuadrado");
        System.out.println(cuadrado.calcularArea());
        System.out.println("Informacion circulo");
        circulo.mostrarInformacion();
        System.out.println("Area circulo");
        System.out.println(circulo.calcularArea());
    }
}
