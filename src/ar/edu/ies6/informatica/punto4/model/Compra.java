package ar.edu.ies6.informatica.punto4.model;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto1.model.Producto;

public class Compra {

	private String codigo;
	private LocalDate fechaCompra;
	private Producto producto;
	private Integer cantidad;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}

	public Compra(String codigo, LocalDate fechaCompra, Producto producto, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.fechaCompra = fechaCompra;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Compra [codigo = " + codigo + ", fechaCompra = " + fechaCompra + ", producto = " + producto + ", cantidad = "
				+ cantidad + "]";
	}
	
	public void imprimirRecibo() {
        Double precioTotal = producto.getPrecioUni() * cantidad;
        System.out.println("Recibo de Compra:");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio Unitario: $" + producto.getPrecioUni());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Total: $" + precioTotal);
        System.out.println("Origen de Fabricación: " + producto.getOrigenFabric());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("----------------------------------");
    }
	
}
