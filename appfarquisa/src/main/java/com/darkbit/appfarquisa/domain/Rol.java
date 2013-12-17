package com.darkbit.appfarquisa.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Rol {
	
	private static final long serialVersionUID = 1L;
	
	public Integer rolId;
	public String descripcion;
	
	public Rol(){
		
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
