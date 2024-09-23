package ar.edu.ies6.informatica.punto1.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.informatica.punto1.model.Producto;
import ar.edu.ies6.informatica.punto1.util.Categoria;
import ar.edu.ies6.informatica.punto1.util.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Producto> almacenProductos = new ArrayList<Producto>();
		
		almacenProductos.add(new Producto("A001","Lenovo_IdeadPad3","Notebook",898898.0,OrigenFabricacion.CHINA,Categoria.INFORMATICA));
		almacenProductos.add(new Producto("A002","Asus_Vivobook16","Notebook",999890.00,OrigenFabricacion.ARGENTINA,Categoria.INFORMATICA));
		almacenProductos.add(new Producto("B001","Philip_600","Licuadora",135000.9,OrigenFabricacion.ARGENTINA,Categoria.ELECTROHOGAR));
		almacenProductos.add(new Producto("C001","Quantum_Q30","Celular",389999.0,OrigenFabricacion.BRASIL,Categoria.TELEFONIA));
		almacenProductos.add(new Producto("D001","Skill_800","Taladro",498898.0,OrigenFabricacion.URUGUAY,Categoria.HERRAMIENTAS));
		
		for (Producto producto : almacenProductos) {
			System.out.println(producto);
		}
		
	}

}
