package Clientes;

public class Clientes {
    private String nombre;
    private String apellido;
    private int id;

    public double monto;
    private double depositar;
    private double retirar;



    public Clientes(String nombre, String apellido, int id,double monto, double depositar, double retirar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.depositar = depositar;
        this.retirar = retirar;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public int getMonto() {
        return (int) monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return " " + getClass() + "\nEl nombre de la persona  es: " + getNombre() +
                "\nEl apellido de la persona es: " + getApellido() +
                "\nSu cedula es:: " + getId() +
                "\nEl monto en la cuenta de la persona es : " + getMonto() +
                "\nEl retiro es : " + getRetirar()+
                "\nEl deposito es : " + getDepositar();
    }
}
