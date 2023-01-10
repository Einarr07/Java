package paquete1;

public class Clase2 {
    public static void main(String[] args){
        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(53);
        objeto1.setNombre("Marco");
        System.out.println("La edad de " + objeto1.getNombre() + " es " + objeto1.getEdad());
    }
}
