package GUIs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class VentanaTrabajador extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JList list1;
    private JTextField INGRESEELRUTDELTextField;

    public void mostrarVentana() {
        setTitle("Ventana de Trabajador");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private modelo.Empresa empresa;
    private datos.ManejoArchivos manejoArchivos;

    public VentanaTrabajador(modelo.Empresa empresa, datos.ManejoArchivos manejoArchivos) {
        this.empresa = empresa;
        this.manejoArchivos = manejoArchivos;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarYMostrarDatos();
            }
        });
    }

    private void buscarYMostrarDatos() {
        String rutIngresado = INGRESEELRUTDELTextField.getText();
        for (modelo.Trabajador trabajador : empresa.getTrabajadores()) {
            if (trabajador.getRut().equals(rutIngresado)) {
                JOptionPane.showMessageDialog(this, trabajador.InformacionTrabajador(), "Datos del Trabajador", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Trabajador no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    }

}

