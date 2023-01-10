package paquete1;

public class Clase1 {
    /*El encapsulamiento es ocultar algunos datos para que no sean modificados*/
    //Atributo
    private int edad;
    private String nombre;
    //Método set (este método es para establecer)
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Método get (este método es para conseguir el valor) - mostrar
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
