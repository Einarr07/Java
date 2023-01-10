public class Persona {
    //Atributos
    protected final String nombre; //El protected hace que sea privado para la clase y que solo lo puedan ver ellas
                                    //y las clases hijas
    private final String apellido;
    private int edad;

    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }
}
