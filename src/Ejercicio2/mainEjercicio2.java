package Ejercicio2;

import java.util.ArrayList;

public class mainEjercicio2 {
	public static void main(String[] args) {
		
		Polideportivo PoliDeportivo1 = new Polideportivo("poli N-1", 300.0, 1);
		Polideportivo PoliDeportivo2 = new Polideportivo("poli N-2", 400.0, 2);
		Polideportivo PoliDeportivo3 = new Polideportivo("poli N-3", 500.0, 3);
		
		EdificioDeOficinas EdificioOficinas1 = new EdificioDeOficinas(600.0, 15);
		EdificioDeOficinas EdificioOficinas2 = new EdificioDeOficinas(700.0, 20);
		
		ArrayList<IEdificio> Edificios = new ArrayList<>();
		Edificios.add(PoliDeportivo1);
		Edificios.add(PoliDeportivo2);
		Edificios.add(PoliDeportivo3);
		Edificios.add(EdificioOficinas1);
		Edificios.add(EdificioOficinas2);
	}
}
