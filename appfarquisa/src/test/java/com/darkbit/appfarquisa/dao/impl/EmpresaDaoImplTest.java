package com.darkbit.appfarquisa.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.service.EmpresaService;
import com.darkbit.appfarquisa.service.SedeService;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/darkbit/appfarquisa/test/system-test-config.xml"})
public class EmpresaDaoImplTest {

	@Autowired
	private EmpresaService empresaService;
	
	@Autowired 
	private SedeService sedeService;
	
	
	
	
	@Test
	public void testAddNewEmpresa(){
		Sede curSede = sedeService.get(3);
		List<Empresa> listEmpresa = empresaService.findBySede(curSede);
		assertNotNull(listEmpresa);
		assertEquals(listEmpresa.size(),0);		
	}

}
