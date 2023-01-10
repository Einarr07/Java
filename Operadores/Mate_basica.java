import java.util.Scanner;
public class Mate_basica {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);

        float numero, numero2, sum, rest, multi, div, residuo;

        System.out.print("Dijite el primer numero: ");
        numero = entrada.nextFloat();
        System.out.print("Dijite el segundo numero: ");
        numero2 = entrada.nextFloat();

        sum = numero + numero2;
        rest = numero - numero2;
        multi = numero * numero2;
        div = numero / numero2;
        residuo = numero % numero2;

        System.out.println("El resultado de la suma es: "+ sum);
        System.out.println("El resultado de la resta es: "+ rest);
        System.out.println("El resultado de la multiplicacion es: "+ multi);
        System.out.println("El resultado de la division es: "+ div);
        System.out.println("El resultado del residuo es: "+ residuo);
    }
}
/*
int numero = 10;

numero += 8; es lo mismo que tener: numero = numero + 8;
numero -= 34;
numero *= 15;
numero /= 3;
numero %= 8;
*/