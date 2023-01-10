public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Constructor 2
    /*Se le llama sobre carga de constructores, cuando existe más de un cosntructor*/
    public Persona(String dni) {
        this.dni = dni;
    }
    //Metodo
    /*Se le llama sobre carga de metodos, cuando existen más de un metodo se los puede diferenciar por
    la cantidad de parametros que estos tengan*/
    public void correr(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años y estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He corrido " + km + " kilometros");
    }
}
