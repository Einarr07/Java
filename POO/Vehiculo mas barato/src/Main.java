import java.util.Scanner;

/*Construir un programa que dada una serie de vehículos caracterizados por su marca,
 modelo y precio, imprima las propiedades del vehículo más barato. Para ello,
 se deberán leer por teclado las características de cada vehículo y crear una clase
 que represente a cada uno de ellos*/
public class Main {
    //metodo static
    public static int indiceCarrobarato (Vehiculo carros[]){
        float precio;
        int indice = 0;

        precio = carros[0].getPrecio();

        for (int i = 1; i < carros.length; i++) {
            if (carros[i].getPrecio() < precio) {
                precio = carros[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    //Principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.print("Ingrese la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        //Creamos los objetos para los carros
        Vehiculo carros[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < carros.length; i++) { //Con length le decimos que itere hasta que sea menor a la
                                                    //cantidad de elementos del mismo
            System.out.println("");
            entrada.nextLine();
            System.out.println("Ingrese las caracteristicas del carro " + (i + 1) + ":");
            System.out.println("Introdusca la marca");
            marca = entrada.nextLine();
            System.out.println("Introdusca el modelo del carro");
            modelo = entrada.nextLine();
            System.out.println("Introdusca el precio del carro");
            precio = entrada.nextFloat();

            carros[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCarrobarato(carros);

        System.out.println("\nEl carro mas barato es: ");
        System.out.println(carros[indiceBarato].mostrarDatos());

    }
}