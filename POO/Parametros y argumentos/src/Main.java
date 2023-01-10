import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        Operacion op1 = new Operacion();

        op1.sumar(n1, n2); //Argumento = Es un valor que se envía (invocación)
        op1.restar(n1, n2);
        op1.mul(n1, n2);
        op1.div(n1, n2);

        op1.mostrar();
    }
}