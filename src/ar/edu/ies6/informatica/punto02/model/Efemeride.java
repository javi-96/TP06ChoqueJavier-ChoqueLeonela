package ar.edu.ies6.informatica.punto02.model;


import ar.edu.ies6.informatica.punto02.util.Util.Mes;

public class Efemeride {
	
	//atributos
	private String codigo;
	private String nombre;
    private Mes mes;
    private String dia;
    private String detalle;
    
    //contructores 
    public Efemeride() {
		// TODO Auto-generated constructor stub
	}

	public Efemeride(String codigo, String nombre, Mes mes, String dia, String detalle) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}
	
	//metodo accesores 
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Efemeride [codigo=" + codigo + ", nombre=" + nombre + ", mes=" + mes + ", dia=" + dia + ", detalle="
				+ detalle + "]";
	}

	public static void remove() {
		// TODO Auto-generated method stub
		
	}

	public static Efemeride get(int i) {
		// TODO Auto-generated method stub
		return null; 
	}
	
	
    
    
    
    
    
    
    
	
	
}
