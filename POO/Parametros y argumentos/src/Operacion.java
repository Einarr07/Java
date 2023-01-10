import javax.swing.*;

public class Operacion {
    //Atributos
    int sumar, restar, multiplicar, dividir;

    //Metodos

    //Metodo para sumar números
    public void sumar(int num1, int num2){ //Parametros = Es la declaración de una variable u objeto
        sumar = num1 + num2;
    }
    //Metodo para restar numeros
    public void restar(int num1, int num2){ //Parametros
        restar = num1 - num2;
    }
    //Metodo para multiplicar numeros
    public void mul(int num1, int num2){
        multiplicar = num1 * num2;
    }
    //Metodo para dividir numeros
    public void div(int num1, int num2){
        dividir = num1 / num2;
    }
    //Meotodo para mostrar los resultados
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"La suma es: " + sumar
                + "\n La resta es: " + restar + "\n La multiplicacion es: " + multiplicar + "\n La division es: " + dividir);
    }

}
