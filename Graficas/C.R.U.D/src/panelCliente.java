import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;

public class panelCliente {
    private JPanel panel1;
    private JTextField idTField;
    private JTextField nombreTField;
    private JTextField telefonoTField;
    private JTextField direccionTField;
    private JTextField gmailTField;
    private JComboBox comboBox;
    private JButton registrarButton;
    private JButton actualizarButton;
    private JTable datosTable;

    Connection con;
    public panelCliente() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conectar();
                try {
                    PreparedStatement ps;
                    ps = con.prepareStatement("insert into clientes (id, nombre, direccion, gmail, telefono, estadoCivul) values (?,?,?,?,?,?)");
                    ps.setInt(1, Integer.parseInt(idTField.getText()));
                    ps.setString(2, nombreTField.getText());
                    ps.setString(3, direccionTField.getText());
                    ps.setString(4, gmailTField.getText());
                    ps.setString(5, telefonoTField.getText());
                    ps.setString(6, comboBox.getSelectedItem().toString());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Los datos han sido guardados correctamente");
                    mostrarDatos();
                    limpiarEntradas();
                } catch (SQLException ex) {
                    throw new RuntimeException(" Error al registrar al cliente "+ ex);
                }

            }

        });

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    PreparedStatement ps = con.prepareStatement("Update clientes set nombre ='" + nombreTField.getText()
                            + "', direccion ='" + direccionTField.getText() +
                            "',gmail='" + gmailTField.getText() + "',telefono = '" + telefonoTField.getText() +
                            "',estadoCivul'" + comboBox.getSelectedItem() + "'Where id='"+idTField.getText()+"'");
                    int indice = ps.executeUpdate();;
                    if (indice > 0){
                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                        mostrarDatos();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No selecciono una fila");
                    }
                }catch (SQLException ep){
                    JOptionPane.showMessageDialog(null, "Error al actualizar datos" + ep);
                }
            }
            public void datosTablemouseClicked(java.awt.event.MouseEvent evt) {
                registrarButton.setEnabled(false);
                actualizarButton.setEnabled(true);
                int fila = this.datosTable.getSelectedRow();
                this.idTField.setText(this.datosTable.getValueAt(fila, 0).toString());
                this.nombreTField.setText(this.datosTable.getValueAt(fila, 1).toString());
                this.direccionTField.setText(this.datosTable.getValueAt(fila, 2).toString());
                this.gmailTField.setText(this.datosTable.getValueAt(fila, 3).toString());
                this.telefonoTField.setText(this.datosTable.getValueAt(fila, 4).toString());
                this.comboBox.setSelectedItem(this.datosTable.getValueAt(fila, 5).toString());
            }
        });

    }

    //Limpiar entradas
    public void limpiarEntradas(){
        idTField.setText("");
        nombreTField.setText("");
        direccionTField.setText("");
        gmailTField.setText("");
        telefonoTField.setText("");
        comboBox.setSelectedIndex(0);
    }
    //Mostrar datos

    public void mostrarDatos(){
        DefaultTableModel mod = new DefaultTableModel();
        mod.addColumn("id");
        mod.addColumn("Nombre y apellido");
        mod.addColumn("Direccion");
        mod.addColumn("Gmail");
        mod.addColumn("Telefono");
        mod.addColumn("Estado civil");
        datosTable.setModel(mod);
        String consutlasql = "Select*from clientes";

        String data[] = new String[6];

        Statement st;
        try{
            st = con.createStatement();
            ResultSet r = st.executeQuery(consutlasql);
            while (r.next()){
                data[0] = r.getString(1);
                data[1] = r.getString(2);
                data[2] = r.getString(3);
                data[3] = r.getString(4);
                data[4] = r.getString(5);
                data[5] = r.getString(6);
                mod.addRow(data);
            }
        } catch (SQLException e) {
        throw new RuntimeException( "Error al mostrar datos"+ e);
        }
    }

    //Metodo conectar
    public void conectar(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CrudClientes",
                    "root", "mysql");
            System.out.println("La conección fue un exito");
        }catch (SQLException e){
            throw new RuntimeException("Error al conectar"+ e);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CRUD");
        frame.setContentPane(new panelCliente().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
