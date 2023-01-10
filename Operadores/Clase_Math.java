public class Clase_Math {
    public static void main(String[] args) {
        //La clase Math nos da la raiz cuadrada de un numero
        int raiz = (int) Math.sqrt(8); //metodo sqrt
        double raiz2 = Math.sqrt(15);
        //Elevar un numero al exponente que nosotros queramos
        double base = 25, exponente = 3;
        double resultado = Math.pow(base, exponente); //metodo pow
        //Redondear un numero
        double numero = 23.6;
        long resultado2 = Math.round(numero);//Para doble se utiliza en long
        float numero2 = 45.8f;
        int resultado3 = Math.round(numero2);//Para float se utiliza el int
        //Numero aleatorio
        double alazar = Math.random();//metodo random

        System.out.println(raiz);
        System.out.println(raiz2);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.print(alazar);
    }
}