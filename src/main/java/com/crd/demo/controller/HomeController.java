package com.crd.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crd.demo.entity.Laptop;
import com.crd.demo.repository.LaptopRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	@Autowired
	private LaptopRepository laptoprepository;
	
	
	@GetMapping("/")
	public String Home() {
		return "index.jsp"	;
		}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/updateData")
	@ResponseBody
	public String update() {
		return "updateData.jsp";
	}
	
	/*
	@PostMapping("/saveLaptopData")
	@ResponseBody
	public String saveData(@RequestParam("id") int id,@RequestParam("brand") String brand,@RequestParam("price") int price) {
		Laptop laptop=new Laptop(id,brand,price);
		
		Laptop lap1=laptoprepository.save(laptop);
		System.out.println(lap1);	
		return "Data Saved Successfully";
		
		
		
	}
	*/
	
	//api for data saved directly as object
	@PostMapping("/saveLaptopData")
	@ResponseBody
	public String saveData(Laptop laptop) {
		laptoprepository.save(laptop);
		return "Data Saved Successfully";
	}
	
	//fetch individual data
	//
	@GetMapping("/getSingleLaptop/{id}")
	@ResponseBody
	public String getSingleData(@PathVariable int id,HttpSession session) {
		
		Optional<Laptop> findById=laptoprepository.findById(id);
		
		 if (findById.isPresent()) {
		        Laptop laptop = findById.get();
		        session.setAttribute("laptop", laptop);
		        return "showSingleData";
		    } else {
		        return "errorView";
		    }
		
	}
	
	//now we need to create jsp page for showing the data
	
	//API for fetching all laptop data
	@GetMapping("/getAllLaptop")
	public ModelAndView getAllLaptop(){
		
		
		ModelAndView mv=new ModelAndView();
		
		List<Laptop> findAllLaptop= laptoprepository.findAll();
		mv.addObject("AllLaptop", findAllLaptop);
		mv.setViewName("showAllLaptopList");
		
		
		return mv;
	}
	
	//we can also fetch data by modelandView
	
	//API for update a record its approximetly same as save operation
	//we need to redirect that registratio page
	@PutMapping("/updateLaptopData")
	@ResponseBody
	public String updateLaptopData(@RequestBody Laptop laptop) {
		
		Laptop laptop1 = laptoprepository.save(laptop);
		System.out.println(laptop1);
		return "update REcord Successfully";
		
	}
	
	//API for deleting data

	@GetMapping("/deleteData/{id}")
	@ResponseBody
	public String deleteData(@PathVariable int id) {
		
		Optional<Laptop> findById=laptoprepository.findById(id);
		Laptop laptop = findById.get();
		 if (laptop!=null) {
			 laptoprepository.delete(laptop);
		       
		    } 
		 return "Data deleted successfully";
		
	}
	
}
