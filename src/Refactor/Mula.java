package Refactor;

public class Mula extends Vehiculo{
    public Mula(int velocidad) {
        super(velocidad);
        this.limiteInferior = 95;
        this.limiteInferiorIntermedio = 96;
        this.limiteSuperior = 110;
    }

    @Override
    public String enviarCorreoFotomulta() {
        return  "// Enviando correo para el tipo mula\nAsunto: comparendo mula";
    }
}
