package Ejercicio2;

public class Polideportivo implements IInstalacionDeportiva, IEdificio{
	
	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	
	//Constructores
	public Polideportivo(){
		this.nombre = "Sin nombre";
		this.superficie = 1.0;
		this.tipoDeInstalacion = 1;
		
	}
	
	
}
