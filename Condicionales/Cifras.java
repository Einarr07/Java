//Pedir un número entre 0 y 99.999 y decir cuantas cifras tiene.
import javax.swing.JOptionPane;
public class Cifras
{
    public static void main(String[] args)
    {
        int numero;
        //
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero entre 0 y 99 999: "));
        if (numero <= 9)
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene solo una sifra");
        }
        else if (numero <= 99)
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene dos sifras");
        }
        else if (numero <= 999)
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene tres sifras");
        }
        else if (numero <= 9999)
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene cuatro sifras");
        }
        else if (numero <= 99999)
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene cinco sifras");
        }
    }
}