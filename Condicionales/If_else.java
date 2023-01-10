import javax.swing.JOptionPane;
public class If_else {
    public static void main(String[] args)
    {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if(numero == 5)
        {
            JOptionPane.showMessageDialog(null, "El numero ingresado es 5");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero ingresado es diferente de 5");
        }
    }
}