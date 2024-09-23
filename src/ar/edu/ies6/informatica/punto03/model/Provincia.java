package ar.edu.ies6.informatica.punto03.model;

import ar.edu.ies6.informatica.punto03.util.Region;

public class Provincia {

	
	private String id;
	private String nombre;
	private Region region;
	private Double poblacion;
	private Double superficie;
	private Boolean estado;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	
	public Provincia(String id, String nombre, Region region, Double poblacion, Double superficie, Boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.region = region;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Double getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Double poblacion) {
		this.poblacion = poblacion;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Provincia [id=" + id + ", nombre=" + nombre + ", region=" + region + ", poblacion=" + poblacion
				+ ", superficie=" + superficie + ", estado=" + estado + "]";
	}
	
	public Double denPobl (Double poblacion, Double superficie) {
	    Double resultado = poblacion / superficie;
	    return resultado;
	}
}