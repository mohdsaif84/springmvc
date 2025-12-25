

package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name", "Mohammad Saif Nawaj");
		model.addAttribute("id", 68986);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Fzijan");
		friends.add("Aman");
		friends.add("Gagan");
		friends.add("uttam");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	
	//services
	//help
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Saif");
		modelAndView.addObject("rollnumber",2432543);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//marks
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(546);
		list.add(97809);
		list.add(897);
		list.add(456);
		list.add(32988200);
		
		modelAndView.addObject("marks",list);
		
		
		//setting the view name
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}

}
