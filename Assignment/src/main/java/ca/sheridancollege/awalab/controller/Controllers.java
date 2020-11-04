package ca.sheridancollege.awalab.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ca.sheridancollege.awalab.beans.Order;




@Controller

public class Controllers {
	List<Order> order = new CopyOnWriteArrayList<Order>();
	@GetMapping("/")
	public String indexMethod(Model model) {
		List<Order> order = new CopyOnWriteArrayList<Order>();
		model.addAttribute("coffelist", new Order());
		model.addAttribute("order",order);
		
	
		return "index";
	}
	@PostMapping("/ordercofee")
	public String orderCoffee(Model model, @ModelAttribute Order coffelist ) 
	{
		List<Order> order = new CopyOnWriteArrayList<Order>();
		
		
		
		for(int i=0 ;i < coffelist.getId(); i++) {
			order.add(coffelist);
			this.order.add(coffelist);
			
			model.addAttribute("coffelist", new Order());
			model.addAttribute("order",order);
			
			
			
		}
		int price= 2*coffelist.getId();
		int totalp= price + 3;
		model.addAttribute("price",price);
		model.addAttribute("totalp",totalp);
		System.out.println(coffelist);
		return "ordercomplete";
		
	}
	
	@PostMapping("/listcofe")
	public String orderCoffee1(Model model, @ModelAttribute Order coffelist ) 
	{
		
		
		
		int price;
		int total=0;
		for(int i=0; i<order.size();i++) {
			total+=order.get(i).getId();
		}
		
		    price=2*total;
			int tax=3;
			int totalp= price + tax;
			model.addAttribute("coffelist", new Order());
			model.addAttribute("order",order);
			model.addAttribute("price",price);
			model.addAttribute("tax",tax);
			model.addAttribute("totalp",totalp);
			
			
			System.out.println(totalp);
			System.out.println(order);
		return "ordercomplete";
			
			
	
	
	}
	
		
}