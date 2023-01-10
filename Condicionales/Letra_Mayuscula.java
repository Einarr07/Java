/*
Determine si la letra ingresada por el usuario es mayuscula o es minuscula.
 */
import javax.swing.JOptionPane;
public class Letra_Mayuscula {
    public static void main(String[] args)
    {
        char letra;
        //
        letra = JOptionPane.showInputDialog("Dijite una letra: ").charAt(0);
        //
        if(Character.isUpperCase(letra))
        {
            JOptionPane.showMessageDialog(null, "La letra [" + letra +"] es una letra mayuscula");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La letra [" + letra + "] es una letra minuscula");
        }
    }
}