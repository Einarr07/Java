public class Estatico {
    private static String frase = "Primera frase";
    /*La palabra static hace que el atributo le pertenezca a la clase NO a los objetos y, por lo tanto,
    el último cambio que realizamos será el definitivo para todos los objetos
    -Esto se utiliza para cambiar un dato para todos los objetos de esa clase
    */
    public static void main(String[] args){
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();

        obj2.frase = "Ultima frase";
        System.out.println(obj2.frase);
        System.out.println(obj1.frase);

        /*
        Cuando el atributo le pertenece a la frase no hay necesidad de instanciar ningún objeto
        (Esto también funciona para metodos)
        public static void main(String[] args){
          System.out.println(Estatico.frase)
        }*/
    }
}
