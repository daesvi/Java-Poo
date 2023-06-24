package Refactor;

public abstract class Vehiculo{
    // Atributos
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;
    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    // Metodos
    public void construirFotoMulta(){
        System.out.println("----El tipo de comparendo es: " + calcularComparendo() + " ----cuerpo del correo " + enviarCorreoFotomulta());
    };
    public int calcularComparendo(){
        if(this.velocidad<=this.limiteInferior) {
            return 0;
        }else if (this.velocidad >= this.limiteInferiorIntermedio && this.velocidad<=this.limiteSuperior) {
            return 1;
        }
        return 2;
    };
    public abstract String enviarCorreoFotomulta();
}