package Ejercicio1;
import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona  {

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
	
		
	//METODO hashCode
	
	@Override
	public int hashCode() {
		return Objects.hash(legajo);
	}
	
	//METODO equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(legajo, other.legajo);
	}
}
