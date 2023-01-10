/*
Hacer un programa que calcule e imprima el
salario semanal de un empleado a partir de sus horas semanales trabajadas
y de su salario por hora.
*/
import java.util.Scanner;
public class Salario {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        double salario, resultado;
        int horas_trabajadas;

        System.out.print("Ingrese de cuanto gano esta semana: ");
        salario = entrada.nextDouble();
        System.out.print("Ingrese cuantas horas trabajo esta semana: ");
        horas_trabajadas = entrada.nextInt();


        resultado = salario / horas_trabajadas;

        System.out.print("Su salario por cada hora trabajada es de: " + resultado);
    }
}