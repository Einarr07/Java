/*
Construir un programa que simule el funcionamiento de una claculadora que puede realizar
las cuatro operaciones aritmeticas basicas (suma - resta - multiyplicacion - división)
con valores numericos enteros. El usuario debe especificar la operación con el primer
cáracter del primer parámetro de la línea de comandos: S o s para sumar -- R o r para restar
-- P, p, M o m para el producto y D o d para la divición
 */
import javax.swing.JOptionPane;
public class Calculadora_aritmetica {
    public static void main(String[] args)
    {
        int numero, numero2, suma, resta, multi, div;
        char operacion;
        //
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        operacion = JOptionPane.showInputDialog("Ingrese la letra de la opracion que desea realizar: S o s para sumar -- R o r para restar -- P, p, M o m para el producto y D o d para la divición").charAt(0);

        switch(operacion)
        {
            case 'S' :
            case 's':
                suma = numero + numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
                break;
            //
            case 'R':
            case 'r':
                resta = numero - numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                break;
            //
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                multi = numero * numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multi);
                break;
            //
            case 'D':
            case 'd':
                div = numero / numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "La letra que ingresaste no es correcta");
        }

    }
}