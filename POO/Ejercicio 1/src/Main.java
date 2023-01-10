import java.util.Scanner;

public class Main {
    //
    public static double mayorArea(Triangulo triangulo_isoseles[]){
        double area;

        area = triangulo_isoseles[0].calcularArea();

        for(int i = 0; i < triangulo_isoseles.length; i++){
            if(triangulo_isoseles[i].calcularArea() > area){
                area = triangulo_isoseles[i].calcularArea();
            }
        }

        return area;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double lado;
        int nTriangulos;

        System.out.print("Ingrese la cantidad de triangulos a trabajar: ");
        nTriangulos = entrada.nextInt();

        //Objetos
        Triangulo triangulo_isoseles[] = new Triangulo[nTriangulos];

        for(int i = 0; i < triangulo_isoseles.length; i++){
            System.out.println("");
            entrada.nextLine();
            System.out.println("Ingrese los valores para el triangulo " + (i+1));
            System.out.print("Ingrese la base del triangulo: ");
            base = entrada.nextDouble();
            System.out.print("Ingrese los lados del triangulo: ");
            lado = entrada.nextDouble();

            triangulo_isoseles[i] = new Triangulo(lado,base);

            System.out.println("\nEl perimetro del triangulo es: " + triangulo_isoseles[i].calcularPerimetro());
            System.out.println("El area del triangulo es: " + triangulo_isoseles[i].calcularArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulo_isoseles));
    }
}