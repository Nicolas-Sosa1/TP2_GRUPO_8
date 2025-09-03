package Ejercicio2;

public class EdificioDeOficinas implements IEdificio{
	
	private double superficie;
	private int oficinas;
	
	public EdificioDeOficinas() {
		this.superficie = 1.0;
		this.oficinas = 1;
	}
	
	
	public EdificioDeOficinas(double Superficie, int Oficinas) {
		this.superficie = Superficie;
		this.oficinas = Oficinas;
	}

	@Override public double getSuperficieEdificio() { return superficie; }

	@Override
	public String toString() {
		return "EdificioDeOficinas [numeroOficinas=" + oficinas + ", superficie=" + superficie + "]";
	}
	

}
