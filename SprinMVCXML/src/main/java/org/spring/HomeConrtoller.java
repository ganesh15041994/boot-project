package org.spring;

import org.spring.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class HomeConrtoller {
	@RequestMapping("/index")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/form")
	public String view()
	{
		return "form";
	}
	
	@RequestMapping(path="/frrm" , method=RequestMethod.POST)
	public String succ(@ModelAttribute Employee e,Model m)
	{
		
		System.out.println(e);
		return "oper";
	}
	

}
