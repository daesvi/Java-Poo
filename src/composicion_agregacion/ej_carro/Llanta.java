package composicion_agregacion.ej_carro;

public class Llanta {
    // Atributos
    private String tipoDeRin;
    private String marca;

    // Constructor
    public Llanta(String tipoDeRin, String marca){
        this.tipoDeRin = tipoDeRin;
        this.marca = marca;
    }

    public String getTipoDeRin() {
        return tipoDeRin;
    }
    public void setTipoDeRin(String tipoDeRin) {
        this.tipoDeRin = tipoDeRin;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarInformacion(int i){
        System.out.println(i+ ". \n  Marca: " + marca + "\n  Tipo de rin: " + tipoDeRin);
    }
}
