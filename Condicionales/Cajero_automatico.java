/*
Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares,
con el siguiente menu de opciones:

1.- Ingresar dinero a la cuenta
2.- Retirar dinero de la cuenta
3.- Salir
 */
import javax.swing.JOptionPane;
public class Cajero_automatico {
    public static void main(String[] args)
    {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldo_actual, retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n" + "1.- Ingresar dinero a la cuenta\n" + "2.- Retirar dinero de la cuenta\n" + "3.- Salir"));
        switch(opcion)
        {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Dijite la cantidad que desea ingresar en la cuenta: "));
                saldo_actual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo_actual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Dijite la cantidad que desea retirar de la cuenta: "));
                if (retiro > saldo_inicial)
                {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
                }
                else
                {
                    saldo_actual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo_actual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion que deseas ingresar no existe");
        }
        JOptionPane.showMessageDialog(null, "Gracias por preferirnos");
    }
}