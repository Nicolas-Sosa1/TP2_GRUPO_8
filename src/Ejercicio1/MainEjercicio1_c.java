package Ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;


public class MainEjercicio1_c {

	public static void main(String[] args) {
		
		 // Crear empleados
		 Empleado emp1 = new Empleado(
		            "20123456", "Juan", "Pérez",
		            LocalDate.of(1990, 3, 14), "Masculino",
		            "Av. Siempre Viva 742, CABA", "11-5555-1234",
		            "juan.perez@empresa.com", "Desarrollador"
		  );
	
		 Empleado emp2 = new Empleado(
		            "23876543", "María", "Gómez",
		            LocalDate.of(1993, 6, 21), "Femenino",
		            "Calle Mitre 123, Lanús", "11-4444-9876",
		            "maria.gomez@empresa.com", "Analista QA"
		  );
	
		  Empleado emp3 = new Empleado(
		            "25678901", "Lucas", "Fernández",
		            LocalDate.of(1988, 11, 5), "Masculino",
		            "San Martín 890, Quilmes", "11-4777-2233",
		            "lucas.fernandez@empresa.com", "Soporte Técnico"
		  );
	
		  Empleado emp4 = new Empleado(
		            "27901234", "Carla", "López",
		            LocalDate.of(1999, 1, 28), "Femenino",
		            "Belgrano 450, Morón", "11-4666-8899",
		            "carla.lopez@empresa.com", "Administrativa"
		   );
	
		   Empleado emp5 = new Empleado(
		            "21456789", "Sofía", "Rojas",
		            LocalDate.of(1986, 12, 3), "Femenino",
		            "Rivadavia 2100, CABA", "11-4333-1122",
		            "sofia.rojas@empresa.com", "Líder de Proyecto"
		   );
		// DNI duplicado para probar Treeset
		   Empleado emp6 = new Empleado(
		            "21456789", "Sofía", "Rojas",
		            LocalDate.of(1986, 12, 3), "Femenino",
		            "Rivadavia 2100, CABA", "11-4333-1122",
		            "sofia.rojas@empresa.com", "Líder de Proyecto"
		   );
		   
		   // Guardar empleados en TreeSet
		   TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();
		   
		   listaEmpleados.add(emp1);
		   listaEmpleados.add(emp2);
		   listaEmpleados.add(emp3);
		   listaEmpleados.add(emp4);
		   listaEmpleados.add(emp5);
		   listaEmpleados.add(emp6);
		   
		   // Mostrar info con Iterator
		   Iterator<Empleado> it = listaEmpleados.iterator();
		   while(it.hasNext()) {
			   Empleado emp = (Empleado) it.next();
			   System.out.println(emp.toString());
		   }

	}

}
