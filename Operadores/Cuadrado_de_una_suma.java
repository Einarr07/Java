/*
Hacer un programa que calcule el cuadrado de una suma.

(a+b)^2 = a^2 + b^2 + 2ab
 */
import java.util.Scanner;
public class Cuadrado_de_una_suma {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        double numero, numero2, total;
        //
        System.out.println("Este programa calcula el cuadrado de una suma 🧮");
        System.out.print("Ingrese el primer numero: ");
        numero = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextDouble();
        //
        total = Math.pow(numero, 2) + Math.pow(numero2, 2) + (2 * numero * numero2);
        //
        System.out.print("El cuadrado de los numeros ingresados son: " + total);
    }
}