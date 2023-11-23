package modelo;

public class Trabajador extends Persona {

	private String isapre;
	private String afp;
	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.isapre = isapre;
		this.afp = afp;
	}

	public String getIsapre() {
		return isapre;
	}

	public String getAfp() {
		return afp;
	}

	public String InformacionTrabajador() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nRUT: " + rut +
				"\nIsapre: " + isapre + "\nAFP: " + afp;
	}

}