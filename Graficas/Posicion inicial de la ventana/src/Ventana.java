import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(300,300);
        setTitle("Posición de la ventana");
        //Agregamos titulo a la ventana
        /*
        setLocation(100,200);
        Establecemos la posicion de la ventana
        ---------------------------------------------------------------------------------
        setBounds(300,200,500,500);
        Con el setBounds engoblamos a la posicion de la ventana como el tamaño de la misma
        Primero la posicion en X, luego en Y después el largo y finalmente el hancho
        */
        setLocationRelativeTo(null);
        //Con este metodo hacemos que la ventana aparezca en el centro de mi pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Esto es para terminar la ejecución del programa haciendo clic en el cierre de ventana
    }
}
