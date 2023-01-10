import javax.swing.*;

public class Operacion {
    //Metodos

    //Metodo para sumar números
    public int sumar(int num1, int num2){ //Parametros = Es la declaración de una variable u objeto
        int suma = num1 + num2;
        return suma;
    }
    //Metodo para restar numeros
    public int restar(int num1, int num2){ //Parametros
        int resta = num1 - num2;
        return resta;
    }
    //Metodo para multiplicar numeros
    public int mul(int num1, int num2){
        int multiplicar = num1 * num2;
        return multiplicar;
    }
    //Metodo para dividir numeros
    public int div(int num1, int num2){
        int dividir = num1 / num2;
        return dividir;
    }
}
