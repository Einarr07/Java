public class Incremento_y_decremento {
    public static void main(String[] args)
    {
        int x = 5, y;

        x++; //Incremento
        x--; //Decremento

        y = x++; //El resultado es 5 - primero se le asigna el valor y luego se ingrementa
        y = ++x; //El resultado es 6 - primero se incrementa el valor de x y luego se asigna a y

        System.out.print(x);
    }
}