package org.tecchub;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/frist")
public class HomeController {
	
	@RequestMapping(path="/index", method = RequestMethod.GET)
	public String home(Model model)
	{
		
		System.out.println("I am Controler");
		model.addAttribute("name", "Ganesh Rathod");
		model.addAttribute("id", 12);
		
	List<String> friends = new ArrayList<String>();
	friends.add("Shubham");
	friends.add("Naru");
	friends.add("Nayku");
	
	model.addAttribute("f", friends);
	System.out.println("Index");
		return "index";
	}
	
	@RequestMapping("/help")
	
	public ModelAndView help()
	{
//		Creating new ModelAndViewObject
		ModelAndView mv = new ModelAndView();
//		Setting The Data
		LocalDateTime now = LocalDateTime.now();
		

		System.out.println("help con");

		mv.addObject("date", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(34);
		list.add(66);
		
		mv.addObject("col", list);
		mv.addObject("name", "Ganesh");
		// Setting the view name
		mv.setViewName("help");
		return mv;
	}

}
