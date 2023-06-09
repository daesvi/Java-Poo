package composicion_agregacion.taller_uno.agregacion;

public class Main {
    public static void main(String[] args) {
        // Instancias de estudiante
        Estudiante estudiante1 = new Estudiante("Daniel", 18,1);
        Estudiante estudiante2 = new Estudiante("Sebastian", 23,2);
        Estudiante estudiante3 = new Estudiante("Camilo", 26,3);

        // Instancia de universidad
        Universidad universidad = new Universidad("Universidad XYZ");

        // Agrega los estudiantes a la universidad
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        // Muestra el nombre de la universidad
        System.out.println(universidad.getNombre());

        // Recorre los estudiantes agregados para mostrarlos por consola
        universidad.mostrarEstudiantes();
    }
}