/*
Pedir al usuario que ingrese 2 numeros y decir cual es mayor o si son iguales.
 */
import javax.swing.JOptionPane;
public class Numero_Mayor {
    public static void main(String[] args)
    {
        int numero, numero2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));

        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        //
        if(numero == numero2)
        {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
            if(numero > numero2)
            {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es el mayor");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es el mayor");
        }
    }
}