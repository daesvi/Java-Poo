package Refactor;

public class Camion extends Vehiculo{
    public Camion(int velocidad) {
        super(velocidad);
        this.limiteInferior = 75;
        this.limiteInferiorIntermedio = 76;
        this.limiteSuperior = 95;
    }

    @Override
    public String enviarCorreoFotomulta() {
        return  "// Enviando correo para el tipo camion\nAsunto: comparendo camion";
    }
}
