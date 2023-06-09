package composicion_agregacion.ej_carro;

public class Carro {
    // Atributos
    private Motor motor;
    private Llanta[] llanta;
    private int numeroLlanta = 0;

    // Constructor
    public Carro(Motor motor){
        this.motor = motor;
        this.llanta = new Llanta[4];
    }

    // Getters y Setters
    public Motor getMotor() {return motor;}
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Llanta[] getLlanta() { return llanta; }
    public void setLlanta(Llanta[] llanta) {this.llanta = llanta;}
    // Metodos
    public void agregarLlanta (Llanta llanta) {

        if (numeroLlanta < 4) {
            this.llanta[numeroLlanta] = llanta;
            numeroLlanta++;
        }
        else
            System.out.println("La cantidad de llantas es mayor a 4");
    }

    public void mostrarInformacionLlantas() {
        System.out.println("Información de las llantas:");
        for (int i = 0; i < numeroLlanta; i++) {
            Llanta llantaa = llanta[i];
            llantaa.mostrarInformacion(i+1);
        }
    }
}
