import java.util.Scanner;
public class Ciclo_while {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        int contador, i = 1;
        System.out.print("Dijite cuantos numeros quiere en pantalla:");
        contador = entrada.nextInt();

        while(i <= contador)
        {
            System.out.println(i);
            i++;
        }
    }
}