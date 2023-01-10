/*
En Mega-Plaza se hace un descuentao del 20% a los clientes cuya compra sea mayor a los $300.
¿Cuál será la cantidad que pagará una persona por su compra?
 */
import javax.swing.JOptionPane;
public class Descuento {
    public static void main(String[] args)
    {
        double compra, descuento;

        compra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de su compra: "));
        if (compra > 300)
        {
            descuento = compra * 0.20;
            descuento = compra - descuento;
            //
            JOptionPane.showMessageDialog(null, "Usted tiene un descuento del 20% por hacer una compra mayor a $300");
            JOptionPane.showMessageDialog(null, "Su pago final es de " + descuento);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Total a pagar " + compra);
        }
    }
}