package modelo;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected String rut;

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}

	public String getRut() {
		return rut;
	}
}