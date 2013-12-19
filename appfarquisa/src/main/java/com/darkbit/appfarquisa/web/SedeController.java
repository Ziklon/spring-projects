package com.darkbit.appfarquisa.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.service.SedeService;
import com.darkbit.appfarquisa.util.Pagination;

@Controller
@RequestMapping(value="/sede")
public class SedeController {

	@Autowired
	private SedeService sedeService;

	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getListSede(@ModelAttribute Pagination pagination) {		
		Map<String, Object> response = new HashMap<String, Object>();
		List<Sede> listSede = sedeService.getAll(pagination);
		response.put("data", listSede);
		response.put("totalCount", pagination.getTotalCount());
		return response;
	}
	
	

}
