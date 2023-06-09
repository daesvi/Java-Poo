package composicion_agregacion.taller_uno.agregacion;

public class Universidad {
    // Atributos
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantEstudiantes;

    // Constructor
    Universidad(String nombre){
        this.nombre = nombre;
        cantEstudiantes = 0;
        this.estudiantes = new Estudiante[100];
    }

    // Metodos
    public void agregarEstudiante(Estudiante estudiante){
        if (this.cantEstudiantes <= this.estudiantes.length){
            this.estudiantes[cantEstudiantes] = estudiante;
            cantEstudiantes++;
        }else {
            System.out.println("Limite de 100 estudiantes alcanzado");
        }
    }

    public void mostrarEstudiantes(){
        System.out.println("Estudiantes:");
        for (int i = 0; i < this.cantEstudiantes; i++) {
            Estudiante estudiante = getEstudiantes()[i];
            System.out.println(" " + (i+1) + ".\n  Nombre: " + estudiante.getNombre() + "\n  Edad: " + estudiante.getEdad() + "\n  ID Estudiante: " + estudiante.getID());
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public Estudiante[] getEstudiantes(){
        return this.estudiantes;
    }

    public int getCantidadEstudiantes (){
        return this.cantEstudiantes;
    }
}
