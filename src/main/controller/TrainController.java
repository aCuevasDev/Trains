package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import main.service.TownService;

@Controller
public class TrainController {
	
	@Autowired TownService townService;
	
	public void main(String[] args)
	{		
		System.out.println("Welcome");
		townService.findTowns().forEach(System.out::println);
	}

}
