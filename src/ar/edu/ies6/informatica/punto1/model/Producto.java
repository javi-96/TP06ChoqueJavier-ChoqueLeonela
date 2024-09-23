package ar.edu.ies6.informatica.punto1.model;

import ar.edu.ies6.informatica.punto1.util.Categoria;
import ar.edu.ies6.informatica.punto1.util.OrigenFabricacion;

public class Producto {

	private String codigo;
	private String nombre;
	private String descripcion;
	private Double precioUni;
	private OrigenFabricacion origenFabric;
	private Categoria categoria;
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public Producto(String codigo, String nombre, String descripcion, Double precioUni, OrigenFabricacion origenFabric,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
		this.origenFabric = origenFabric;
		this.categoria = categoria;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecioUni() {
		return precioUni;
	}


	public void setPrecioUni(Double precioUni) {
		this.precioUni = precioUni;
	}


	public OrigenFabricacion getOrigenFabric() {
		return origenFabric;
	}


	public void setOrigenFabric(OrigenFabricacion origenFabric) {
		this.origenFabric = origenFabric;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Producto [codigo = " + codigo + ", descripcion = " + descripcion + ", precioUni = " + precioUni
				+ ", origenFabric = " + origenFabric + ", categoria = " + categoria + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
}
