import java.util.Scanner;
public class Entrada_y_salida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Numeros
        int numero;
        float decimal;
        //Cadenas
        String cadena, cadena2;
        //
        char letra;

        System.out.print("Por favor ingrese un numero entero: ");
        numero = entrada.nextInt();
        System.out.println("El numero entero es: " + numero);
        //
        System.out.print("Por favor ingrese un numero decimal: ");
        decimal = entrada.nextFloat();
        System.out.println("El numero decimal es: " + decimal);

        //Cadenas
        /*
        System.out.print("Ingrese una cadena: ");
        cadena = entrada.nextLine(); // Sirve para agregar toda la linea que ingresemos en la cadena
        System.out.println("La cadena que usted ingreso es: " + cadena);
        */
        //
        System.out.print("Ingrese una segunda cadena: ");
        cadena2 = entrada.next();//El punto nex es solo para una palabra (Solo guarda la cadena hasta que encuentre un espacio)
        System.out.println("La cadena dos es: " + cadena2);
        //Caracter
        System.out.print("Ingrese una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("La letra es: " + letra);
    }
}