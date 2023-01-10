import java.util.Scanner;
public class Calcular_la_suma_de_3_notas {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, nota3, resultado;

        System.out.print("Ingrese su primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese su segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese su tercer nota: ");
        nota3 = entrada.nextDouble();

        resultado = (nota1 + nota2 + nota3) / 3;

        System.out.print("Su promedio es de: " + resultado);
    }
}