package com.darkbit.appfarquisa.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darkbit.appfarquisa.dao.SedeDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/darkbit/appfarquisa/test/system-test-config.xml"})
public class SedeDaoImplTest {

	@Autowired
	private  SedeDao sedeDao;

	@Test
	public void testAddNewSede() {
		assertNotNull(sedeDao);
		
	}
	
	
	
	@Test
	public void testgetAllSede(){
		assertEquals(sedeDao.getAll().size(), 1004);
	}
	

}
