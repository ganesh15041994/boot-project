package org.spr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/help")
	public String  help(Model model)
	{
		model.addAttribute("name", "Ganesh");
		return "help";
		
		
	}

}
