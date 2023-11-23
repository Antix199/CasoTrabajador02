
package modelo;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Empresa empresa = new Empresa();
			empresa.inicializarTrabajadores();
			GUIs.VentanaTrabajador ventana = new GUIs.VentanaTrabajador(empresa, new datos.DatosTrabajador());
			ventana.mostrarVentana();
		});
	}

}