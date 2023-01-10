/*
Hacer un programa que tome dos números y diga si ambos son pares o impares.
 */
import javax.swing.JOptionPane;
public class Pares_e_Impares {
    public static void main(String[] args)
    {
        int numero, numero2;
        //
        JOptionPane.showMessageDialog(null, "Este programa determina si DOS numeros son pares o no");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingre el segundo numero"));
        //
        if(numero % 2 == 0 && numero2 % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Los numeros son PARES ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Los numeros son IMPARES ");
        }
    }
}