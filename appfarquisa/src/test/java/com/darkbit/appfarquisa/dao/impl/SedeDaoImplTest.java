package com.darkbit.appfarquisa.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darkbit.appfarquisa.service.SedeService;
import com.darkbit.appfarquisa.util.Pagination;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/darkbit/appfarquisa/test/system-test-config.xml"})

public class SedeDaoImplTest {

	@Autowired
	private  SedeService sedeService;

	@Test
	public void testAddNewSede() {
		assertNotNull(sedeService);		
	}	
	
	@Test
	public void testgetAllSede(){
		Pagination pagination=new Pagination(0);
		assertEquals(sedeService.getAll(pagination).size(), 10);
		assertEquals(pagination.getTotalCount().intValue(), 1004);
	}
	

}
