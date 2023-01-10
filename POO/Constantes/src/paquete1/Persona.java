package paquete1;

public class Persona {
    //Atributos
    private final String nombre; //Para declarar una constante se necesita la palabra final
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
}
