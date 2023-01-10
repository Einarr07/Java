import Clientes.Clientes;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Metodos {
    int monto = 500;

    public static int opcion() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "    >> Bienvenido al Cajero << " +
                            "\n1.-Consultar Saldo" +
                            "\n2.-Realizar un deposito" +
                            "\n3.-Realizar una transaccion" +
                            "\n0.-Salir" +
                            "\nSeleccione: "));
        } while (op < 0 || op > 3);
        return op;
    }

    private static void Entrada(Clientes a[]) {
        Scanner leer = new Scanner(System.in);
        //creamos variables para poder usarlas en
        String nombre;
        String apellido;
        int id;
        double monto = 500;
        double depositar;
        double retirar;


        //Ingresamos la informacion de los videojuegos que deseamos crear
        for (int i = 0; i < 3; i++) {
            System.out.println("----Persona----- [" + (i + 1) + "]");
            System.out.print("Ingrese el nombre : ");
            nombre = leer.nextLine();
            System.out.print("Ingrese el apellido: ");
            apellido = leer.nextLine();
            System.out.print("Ingrese su cedula de identidad: ");
            id = leer.nextInt();
            System.out.print("El valor a depositar es : ");
            depositar = leer.nextDouble();
            leer.nextLine();
            System.out.print("El valor a retirar es : ");
            retirar = leer.nextDouble();
            leer.nextLine();

            a[3] = new Clientes(nombre, apellido, id, monto, depositar, retirar);

        }

        public static void proceso () {
            int op;
            do {
                switch (op = opcion()) {
                    case 1: {
                        JOptionPane.showMessageDialog(null, "Tu saldo a la fecha es:" + monto);
                        break;
                    }
                    case 2: {
                        String ax;
                        ax = JOptionPane.showInputDialog(null, "Cuanto desea depositar: ");
                        if (!(ax == null)) {//si es numero lo ingresado
                            depositar = Integer.parseInt(ax);
                            if (depositar > 0) {//si el valor a consignar es mayor que 0 se realiza la consignacion
                                monto += depositar;//se suma el nuevo valor al saldo
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta cantidad no es mayor a 0");
                            }
                        }
                        break;
                    }
                    case 3: {
                        String ax = null;
                        if (!(ax == null)) {//si es numero lo ingresado
                            retirar = Integer.parseInt(ax);
                            if (retirar > 0) {//si el valor a consignar es mayor que 0 se realiza la consignacion
                                monto -= retirar;//se suma el nuevo valor al saldo
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta cantidad no es mayor a 0");
                            }
                        }
                        break;
                    }
                }
            } while (op != 0);
        }

        public static void guardar (Clientes b[]){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Usuarios\\ESFOT\\ExamenPrimerBImestre.txt"))) {
                for (int i = 0; i < b.length; i++) {
                    bw.write("----Persona----- [" + (i + 1) + "]");
                    bw.write(b[i].toString());
                }
                System.out.println("Escritura Correcta");
            } catch (IOException e) {
                System.out.println("Error en el direccionamiento");
            }
        }

        public static void main (String[]args){
            int num = opcion();
            Clientes aux1[] = new Clientes[num];
            Entrada(aux1);
            proceso(aux1)
            guardar(aux1);
        }
    }
}