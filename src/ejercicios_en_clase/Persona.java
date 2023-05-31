package ejercicios_en_clase;

public class Persona {
    // Atributos
    private String name;
    private int age;
    private int ID;

    // Constructor vacio
    public Persona(){
    }

    // Constructor con parametros
    public Persona(String name, int age, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Getters y Setters
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    // No se pone el set al ID porque no se puede cambiar una identificacion
    public int getID(){return ID;}

    public void mostrarInformacion(){
        System.out.println("Mi nombre es: " + name);
        System.out.println("Mi edad es: " + age);
        System.out.println("Identificacion: " + ID);
    }

    public boolean esMayorDeEdad(){
        return this.age >=18;
    }
}