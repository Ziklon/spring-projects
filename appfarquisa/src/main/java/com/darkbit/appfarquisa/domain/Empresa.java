package com.darkbit.appfarquisa.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Empresa {

	private static final long serialVersionUID = 1L;
	
	private Integer empresaId;
	private String descripcion;
	private Sede sede;
	
	public Empresa(){
		
	}

	public Integer getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	
	
}
