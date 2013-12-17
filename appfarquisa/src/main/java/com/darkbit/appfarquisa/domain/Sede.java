package com.darkbit.appfarquisa.domain;

public class Sede {

	private static final long serialVersionUID = 1L;
	
	private Integer sedeId;
	private String descripcion;
	private String direccion;
	
	public Sede(){
		
	}

	public Integer getSedeId() {
		return sedeId;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
