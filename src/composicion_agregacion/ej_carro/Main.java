package composicion_agregacion.ej_carro;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Motor V6","Combustión interna");

        Carro carro1 = new Carro(motor1);

        Llanta llantaDI = new Llanta("Michelin","Acero");
        Llanta llantaDD = new Llanta("Bridgestone","Aluminio");
        Llanta llantaTI = new Llanta("Pirelli","Fibra de carbono");
        Llanta llantaTD = new Llanta("Continental","Cromo");

        carro1.agregarLlanta(llantaDI);
        carro1.agregarLlanta(llantaDD);
        carro1.agregarLlanta(llantaTI);
        carro1.agregarLlanta(llantaTD);
        carro1.agregarLlanta(llantaTD);

        carro1.getMotor().mostrarInformacion();
        carro1.mostrarInformacionLlantas();
    }
}
