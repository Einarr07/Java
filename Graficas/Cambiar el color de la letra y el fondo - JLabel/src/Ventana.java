import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(500,300);
        setTitle("Creacion de un panel");


        setLocationRelativeTo(null);
        //Con este metodo hacemos que la ventana aparezca en el centro de mi pantalla

        iniciarComponente();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Esto es para terminar la ejecución del programa haciendo clic en el cierre de ventana
    }
    private void iniciarComponente(){
        JPanel panel = new JPanel(); //Creación del panel

        panel.setLayout(null); //Desactivamos el diseño

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        //Cuando colocamos el this nos referimos al JFrame

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola como estas?"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(100,100,120,20); //Deinimos el lugar de nuestra etiqueta
        etiqueta.setForeground(Color.yellow); //Establecemos el color de la letra
        etiqueta.setOpaque(true);//Pedimos permiso para pintar la etiqueta
        etiqueta.setBackground(Color.BLACK); //Cambiamos el color del fondo de la etiqueta
        panel.add(etiqueta); //Agregamos la etiqueta al panel
    }
}