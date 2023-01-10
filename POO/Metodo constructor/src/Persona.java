public class Persona {
    //Atrinbutos
    String nombre;
    String apellido;
    int edad;

    //Metodos

    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre; //Cuando se coloca this es para decirle a java que esa variable es el atributo
        this.apellido = apellido;
        this.edad = edad;
    }
    //Metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("La edad es: " + edad);
    }
}
