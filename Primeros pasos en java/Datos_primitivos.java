public class Datos_primitivos {
    public static void main(String[] args) {
        /*Variables con numeros enteros*/
        byte entero = 21; //Los byte abarcan numeros desde el -128 a 127
        //Tiene un tamaño de 8
        short chiquito = 32767; // Los short abarcan -32.768 a 32.767
        //Tiene un tamaño de 16 bits
        int numero = -2147483648; //Los int abarcan numeros desde: -2.147.483.648 a 2.147.483.647
        //Tiene un tamaño de 32
        long largo = 214748895; //Los long abarcan numeros desde -9.223.372.036.854.775.808 a 9.223.372.854.775.807
        //Tiene un tamaño de 64

        /*Variables con numeros decimales*/
        double doble = 456487.1464; //Tiene un tamaño de 64 bits
        float decimal = 456487.1464f; //Tiene un tamaño de 32

        /*Variables con numeros decimales*/
        char caracter = '[';

        /*Variables boleanas*/
        boolean decision = true;
        System.out.println("Variables con numeros enteros");
        System.out.println("Holi la variable entero vale: " + entero);
        System.out.println("Holi la variable chiquito vale: " + chiquito);
        System.out.println("Holi la variable numero vale: " + numero);
        System.out.println("Holi la variable largo vale: " + largo);
        System.out.println("");
        System.out.println("Variables con numeros decimales");
        System.out.println("Holi la variable doble vale: " + doble);
        System.out.println("Holi la variable decimal vale: " + decimal);
        System.out.println("");
        System.out.println("Variables del tipo caracter");
        System.out.println("El caracter es:" + caracter);
        System.out.println("");
        System.out.println("Variables boleanas");
        System.out.println("La variable es:" + decision);
    }
}
