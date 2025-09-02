package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		
        HashSet<Persona> personas = new HashSet<>();

        personas.add(new Persona("20111222","Ana","Gómez",  LocalDate.of(1990,5,12),"Femenino","Belgrano 100","555-1001","ana@mail.com"));
        personas.add(new Persona("23123456","Bruno","Pérez", LocalDate.of(1988,1,3),"Masculino","San Martín 500","555-1002","bruno@mail.com"));
        personas.add(new Persona("25456789","Carla","Luna",  LocalDate.of(1995,9,21),"Femenino","Sarmiento 250","555-1003","carla@mail.com"));
        personas.add(new Persona("27876543","Diego","Ruiz",  LocalDate.of(1992,3,15),"Masculino","Rivadavia 720","555-1004","diego@mail.com"));
        personas.add(new Persona("31234567","Lucía","Fernández", LocalDate.of(1994,6,30),"Femenino","Belgrano 250","555-1010","lucia@mail.com"));

        
        // DNI duplicado para probar HashSet
        personas.add(new Persona("25456789","Carla","Luna",  LocalDate.of(1995,9,21),"Femenino","Sarmiento 250","555-1003","carla@mail.com"));

        System.out.println("Personas en el HashSet:");
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Total (sin duplicados): " + personas.size());
		
        
	}

}
