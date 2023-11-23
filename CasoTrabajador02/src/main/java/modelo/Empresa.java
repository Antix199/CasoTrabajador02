package modelo;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Trabajador> trabajadores;

	public Empresa(){
		trabajadores = new ArrayList<>();
	}

	public void inicializarTrabajadores() {
		trabajadores.add(new Trabajador("Juan", "Perez", "12345678-9", "Colmena", "AFP UNO"));
		trabajadores.add(new Trabajador("Maria", "Gomez", "98765432-1", "Consalud", "AFP MODELO"));
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
}