package ar.edu.ies6.informatica.punto02.main;


import java.util.ArrayList;

import java.util.List;

import ar.edu.ies6.informatica.punto02.model.Efemeride;
import ar.edu.ies6.informatica.punto02.util.Util.Mes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Crear ArrayList para almacenar efemérides
		   List<Efemeride> almacenDeEfemerides = new ArrayList<Efemeride>();
		   
		   almacenDeEfemerides.add(new Efemeride("01","Día de la Independencia", Mes.JULIO,"9","Conmemoración de la independencia"));
		   almacenDeEfemerides.add(new Efemeride("02","Día de la Primavera", Mes.SEPTIEMBRE,"21","Fiesta de la primavera"));
		   almacenDeEfemerides.add(new Efemeride("03","Navidad", Mes.DICIEMBRE,"25","Celebración de la Navidad"));
		   almacenDeEfemerides.add(new Efemeride("04","Día del Trabajador", Mes.MAYO,"1","Celebración de los trabajadores"));
		   almacenDeEfemerides.add(new Efemeride("05","Año Nuevo", Mes.ENERO,"1","Comienzo del año nuevo"));
		   
		   System.out.println("Lista original de efemérides:");
	        for (Efemeride e : almacenDeEfemerides) {
	            System.out.println(e.getNombre() + " - " + e.getDia() + " " + e.getMes());
	        }
		   
		   // Eliminar la 3ra efemeride
		  almacenDeEfemerides.remove(2);
		  
		// Modificar la 2da efemeride (cambiar nombre y detalle)
		  Efemeride segundaEfemeride = almacenDeEfemerides.get(1);
	        segundaEfemeride.setNombre("Día Internacional de la Primavera");
	        segundaEfemeride.setDetalle("Celebración de la llegada de la primavera");
	        
	        
	        System.out.println("Lista de efemérides después de la modificación:");
	        for (Efemeride e : almacenDeEfemerides) {
	            System.out.println(e.getNombre() + " - " + e.getDia() + " " + e.getMes());
	        }
	  
   

	}
}
