/*
Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales,
más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora de datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/

import java.util.Scanner;
public class Compañia {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        final int mensual = 1000, comision = 150;
        double costo_carro, salario, carros_vendidos, porcentaje;
        //
        System.out.print("Ingrese el costo del vehiculo: ");
        costo_carro = entrada.nextDouble();
        System.out.print("Ingrese cuantos carros vendio: ");
        carros_vendidos = entrada.nextDouble();
        //
        carros_vendidos *= comision;
        porcentaje = costo_carro * 0.05;
        salario = mensual + porcentaje + carros_vendidos;
        //
        System.out.print("Su salario este mes es de: " + salario);
    }
}
