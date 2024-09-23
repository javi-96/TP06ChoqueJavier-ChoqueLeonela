package ar.edu.ies6.informatica.punto1.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.informatica.punto1.model.Producto;
import ar.edu.ies6.informatica.punto1.util.Categoria;
import ar.edu.ies6.informatica.punto1.util.OrigenFabricacion;
import ar.edu.ies6.informatica.punto4.model.Compra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Producto> almacenProductos = new ArrayList<Producto>();
		
		almacenProductos.add(new Producto("A001","Lenovo_IdeadPad3","Notebook",898898.0,OrigenFabricacion.CHINA,Categoria.INFORMATICA));
		almacenProductos.add(new Producto("A002","Asus_Vivobook16","Notebook",999890.00,OrigenFabricacion.ARGENTINA,Categoria.INFORMATICA));
		almacenProductos.add(new Producto("B001","Philip_600","Licuadora",135000.9,OrigenFabricacion.ARGENTINA,Categoria.ELECTROHOGAR));
		almacenProductos.add(new Producto("C001","Quantum_Q30","Celular",389999.0,OrigenFabricacion.BRASIL,Categoria.TELEFONIA));
		almacenProductos.add(new Producto("D001","Skill_800","Taladro",78898.0,OrigenFabricacion.URUGUAY,Categoria.HERRAMIENTAS));
		almacenProductos.add(new Producto("B002","Liliana","Pava Eléctrica",8898.0,OrigenFabricacion.URUGUAY,Categoria.ELECTROHOGAR));
		almacenProductos.add(new Producto("C002","Samsung A05","Celular",358898.0,OrigenFabricacion.CHINA,Categoria.TELEFONIA));
		almacenProductos.add(new Producto("D002","Philip 800","Taladro",87898.0,OrigenFabricacion.BRASIL,Categoria.HERRAMIENTAS));
		almacenProductos.add(new Producto("A003","Hp 800","Notebook",498898.0,OrigenFabricacion.ARGENTINA,Categoria.INFORMATICA));
		almacenProductos.add(new Producto("B003","Drean 10","Lavarropa",1008898.0,OrigenFabricacion.ARGENTINA,Categoria.ELECTROHOGAR));
		
		/*for (Producto producto : almacenProductos) {
			System.out.println(producto);
		}*/
	
		
		List<Compra> almacenCompra = new ArrayList<Compra>();
		
		almacenCompra.add(new Compra("CP001",LocalDate.now(),almacenProductos.get(0),1));
		almacenCompra.add(new Compra("CP002",LocalDate.now(),almacenProductos.get(3),3));
		almacenCompra.add(new Compra("CP003",LocalDate.now(),almacenProductos.get(9),1));

		
		/*for (Compra compra : almacenCompra) {
			System.out.println(compra);
		}*/
	
		almacenCompra.get(0).imprimirRecibo();
		almacenCompra.get(1).imprimirRecibo();
		almacenCompra.get(2).imprimirRecibo();

		
	}
}
