package ClaseYObjetos;

import javax.swing.*;

public class Operacion {
    //Atributos
    int num1, num2;
    int sumar, restar, multiplicar, dividir;

    //Metodos

    //Metodo para pedirle al usuiario 2 numeros
    public void leerNumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }
    //Metodo para sumar números
    public void sumar(){
        sumar = num1 + num2;
    }
    //Metodo para restar numeros
    public void restar(){
        restar = num1 - num2;
    }
    //Metodo para multiplicar numeros
    public void mul(){
        multiplicar = num1 * num2;
    }
    //Metodo para dividir numeros
    public void div(){
        dividir = num1 / num2;
    }
    //Meotodo para mostrar los resultados
    public void mostrar(){
    JOptionPane.showMessageDialog(null,"La suma es: " + sumar
    + "\n La resta es: " + restar + "\n La multiplicacion es: " + multiplicar + "\n La division es: " + dividir);
    }
}
