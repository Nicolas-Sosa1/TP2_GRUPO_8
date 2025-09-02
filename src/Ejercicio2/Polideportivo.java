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
	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	

	
	public void setNombre(String nombre) { 
		this.nombre = nombre; 
		}
	
	public String getNombre() { 
		return nombre; 
		}
	
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setTipoDeInstalacion(int tipo) { 
    	this.tipoDeInstalacion = tipo; 
    	}
	
}
