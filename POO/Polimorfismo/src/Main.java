/*En una relación de tipo herencia, un objeto de la superclase puede almacenar un objeto de
  cualquiera de sus subclases.
* Esto significa que la clase padre o superclase es compatible con los tipos que derivan de ella
  pero no al revés.*/
public class Main {
    public static void main(String[] args) {
        Vehiculo carro[] = new Vehiculo[4];

        carro[0] = new Vehiculo("asd-78","Ferrari","A89");
        carro[1] = new VehiculoTurismo("ret-l","Audi","E96",4);
        carro[2] = new VehiculoDeportivo("trd-89", "Toyota","R56",500);
        carro[3] = new VehiculoFurgoneta("yth-74", "Toyota", "J9",120);

        for(Vehiculo vehiculo: carro){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}