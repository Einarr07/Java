public class VehiculoDeportivo extends Vehiculo{
    //Atributos
    private int cilindrada;

    //Constructor
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public String mostrarDatos(){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindrada: "
                + cilindrada;
    }
}
