package ejercicios_en_clase;

public class MainPersona {
    public static void main(String[] args) {
        Persona daniel = new Persona("Daniel",18,1025643810);
        System.out.println(daniel.getName());
        System.out.println("********************");
        // Cambio el nombre con el metodo setName
        daniel.setName("Esteban");
        // Llamo el metodo mostrar informacion para verificar que se cambió
        daniel.mostrarInformacion();
    }
}