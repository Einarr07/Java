public class Estudiante extends Persona{
    //Atributos
    private final int codigoEstudiante;
    private float notaFinal;
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre,apellido,edad); //Invoca al constructor de la clase superior
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    //Metodo
    public void mostrarDatos(){
        System.out.println("El estudiante " + nombre + " " + getApellido() + " con " + getEdad() + " años de edad " +
                "\nQue pertenece al codigo: " + codigoEstudiante);
        System.out.println("Tiene una nota final de: " + notaFinal);
    }
}
