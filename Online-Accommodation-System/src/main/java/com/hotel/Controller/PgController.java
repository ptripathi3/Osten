package com.hotel.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.Service.Pgservice;
import com.hotel.model.Pg;


@Controller
@RequestMapping("/")
public class PgController {

	@Autowired
	private Pgservice pgservice;


	@RequestMapping("/index")
	public String setupForm1(Map<String, Object> map) {
		Pg pg = new Pg();
		map.put("pg", pg);
		map.put("pgList", pgservice.viewAll());
		return "pg";
	}
	
	
	
	
	
	@RequestMapping("/search")
	public ModelAndView signUp()
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("search");
		mv.addObject("result");
		
		return mv;
	}
	
	
	
	

	@RequestMapping(value = "/pg.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Pg pg, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {

		Pg pgResult = new Pg();
		if (action.toLowerCase() == "add") {
			pgservice.add(pg);
			pgResult = pg;
		}
		if (action.toLowerCase() == "edit") {
			pgservice.update(pg.getPgid()); 
			pgResult = pg;
		}
		if (action.toLowerCase() == "search") {
			pgservice.viewAll();
			pgResult = pg;
		}
		if (action.toLowerCase() == "delete") {
			pgservice.remove(pg.getPgid());
			pgResult = pg;
		}
		map.put("pg", pgResult);
		map.put("pgList", pgservice.viewAll());
		return "pg";
	}
}
