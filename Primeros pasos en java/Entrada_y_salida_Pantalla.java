import javax.swing.JOptionPane;
public class Entrada_y_salida_Pantalla {
    public static void main (String[] args)
    {
        String cadena;
        int numero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Dijite una cadena: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero entero: "));
        letra = JOptionPane.showInputDialog("Dijite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Dijite un numero decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena que ingreso es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero que ingreso es: " + numero);
        JOptionPane.showMessageDialog(null, "El caracter que ingreso es: " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal que ingreso es: " + decimal);
    }
}