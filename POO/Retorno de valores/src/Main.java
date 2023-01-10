import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        Operacion op1 = new Operacion();

        JOptionPane.showMessageDialog(null,"La suma es: " + op1.sumar(n1, n2)
                + "\n La resta es: " + op1.restar(n1, n2) + "\n La multiplicacion es: " + op1.mul(n1, n2)
                + "\n La division es: " + op1.div(n1, n2));
    }
}