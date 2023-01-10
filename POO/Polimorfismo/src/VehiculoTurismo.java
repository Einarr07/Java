public class VehiculoTurismo extends Vehiculo{

    //Atributos
    private int numeroPuertas;

    //Constructir
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarDatos(){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNumero de puertas: "
                + numeroPuertas;
    }
}
