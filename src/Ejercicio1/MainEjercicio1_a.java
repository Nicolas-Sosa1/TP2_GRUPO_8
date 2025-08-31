package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEjercicio1_a {
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("AA202020","Juan","Martinez", LocalDate.of(2000, 10,9),"masculino","calle123","11-2030-4050","Juan@mail.com");
		Persona persona2 = new Persona("20202020","Juliana","Perez", LocalDate.of(2002, 8,7),"femenino","calle321","11-9080-7060","Juliana@mail.com");
		
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(persona1);
		personas.add(persona2);
		
		for(Persona p : personas){
			try{
				Persona.exVerificarDNI(p.getDni());
				System.out.println("Persona agregada correctamente");
			}
			catch(Exception e){
				System.out.println("Persona no agregada por no verificar el DNI");
			}
		}
	}
}
