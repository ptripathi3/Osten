package com.hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.Service.AddressService;
import com.hotel.model.Address;
import com.hotel.model.User;

@Controller
@RequestMapping("/")
public class HotelController {

	@Autowired
	private AddressService addressService;

	@RequestMapping("/hotelSearch")
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Search");
		mv.addObject("result");
		return mv;
	}

	@ModelAttribute("Address")
	public Address setSearchForm() {
		return new Address();
	}

	@RequestMapping("/search-hotel")
	public ModelAndView hotel(@ModelAttribute("address") Address add) 
	{
		addressService.searchByCity(add.getCity());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("message", "hotel search successfully.");

		return mv;
	}
}
