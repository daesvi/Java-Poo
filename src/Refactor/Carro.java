package Refactor;

public class Carro extends Vehiculo{
    public Carro(int velocidad) {
        super(velocidad);
        this.limiteInferior = 65;
        this.limiteInferiorIntermedio = 66;
        this.limiteSuperior = 85;
    }

    @Override
    public String enviarCorreoFotomulta() {
        return  "// Enviando correo para el tipo carro\nAsunto: comparendo carro";
    }
}
