package Ejercicio1;
import java.time.LocalDate;

public class Empleado extends Persona {

// atributos
	private final int legajo;
	private String puesto;
	
// estáticos
	private static int ultimoLegajo = 999;
	
	public static int devuelveProximoLegajo() {
		return ultimoLegajo +1;
	}
	
//getters and setters

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}

//constructor 1
	public Empleado() {
		super();
		this.legajo = ++ultimoLegajo;
		this.puesto = "sin puesto";
		
	}
	
// Constructor 2
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
					String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.legajo = ++ultimoLegajo;
		this.puesto = puesto;
	}

// Metodo ToString
	@Override
	public String toString() {
		return super.toString() +
				"Empleado [legajo=" + legajo + ", puesto=" + puesto + "]";
	}
		

	
}
