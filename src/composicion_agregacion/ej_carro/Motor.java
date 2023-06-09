package composicion_agregacion.ej_carro;

public class Motor {
    // Atributos
    private String marca;
    private String tipoMotor;

    // Constructor
    public Motor(String marca, String tipoMotor){
       this.marca = marca;
       this.tipoMotor = tipoMotor;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNombreDeValvula() {
        return tipoMotor;
    }
    public void setNombreDeValvula(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void mostrarInformacion(){
        System.out.println("Motor:  \n  Marca: " + marca + "\n  Tipo de motor: " + tipoMotor);
    }
}
