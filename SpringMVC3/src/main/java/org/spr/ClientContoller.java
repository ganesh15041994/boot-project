package org.spr;

import javax.servlet.http.HttpServletRequest;

import org.spr.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ClientContoller {
	@ModelAttribute // Adding every fields in our model or other request handler
	// frist way
	public void commanDataForModel(Model m)
	{
		m.addAttribute("Header", "New Registration Form");
		m.addAttribute("dis", "Home For Programmer");
		System.out.println("Adding field");
	}
// ModelAttribute
	@RequestMapping("/con")
	public String showFrom() {
		
		
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handerFrom(@ModelAttribute User user, Model model) {//secod way 

		/*
		 * @RequestParam("name") String name,
		 * 
		 * @RequestParam("email") String email,
		 * 
		 * @RequestParam("pass") String pass,Model model)
		 */

		 System.out.println(user);
		
		

		return "success";
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String handerFrom(
	 * 
	 * @RequestParam("name") String name,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("pass") String pass,Model model) {
	 * 
	 * System.out.println("User Name"+name); System.out.println("User Email"+email);
	 * System.out.println("User Password"+pass);
	 * 
	 * User user = new User(); user.setName(name); user.setEmail(email);
	 * user.setPass(pass);
	 * 
	 * model.addAttribute("user",user); System.out.println(user);
	 * 
	 * model.addAttribute("name", name); model.addAttribute("email",email);
	 * model.addAttribute("pass", pass);
	 * 
	 * 
	 * return "success"; }
	 */

}
