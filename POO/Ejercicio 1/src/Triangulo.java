/* Diseñar un programa para trabajar con triangulos isoceles. Para elloo defina los atributos necesarios
que se requieren, proporcione metodos de consulta, un metodo constructor e implemente metodos para
calcular el perimetro y el area de un truangulo, además implementar un método qyue a partir
de un arreglo de trinagulos devuelva el area del triangulo de mayor superdicie
*/
public class Triangulo {
    //Atributos
    private double lado;
    private double base, altura;

    //Constructor
    public Triangulo(double lado, double base){
        this.base = base;
        this.lado = lado;
    }
    //Metodos
    public double calcularPerimetro(){
        double perimetro = (2 * lado) + base;
        return perimetro;
    }
    public double calcularArea(){
        double area = (base * Math.sqrt((lado * lado) - (base * base) / 4 )) / 2;
        return area;
    }
    public String trianguloSuperficeM(){
        return "Base: " + base + "\nLado: " + lado + "\nPerimetro: " + calcularPerimetro() + "\nArea: "
                + calcularArea() + "\n";
    }
}
