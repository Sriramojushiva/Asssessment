package com.shiva.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.demo.dao.OmegaRepo;
import com.shiva.demo.model.email;
import com.shiva.demo.model.omega;

@Controller
public class omegacontroller 
{
	@Autowired
	OmegaRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addomega")
	public String addomega(omega omega){
		repo.save(omega);
		return "home.jsp";
		
	}
	@RequestMapping(path="/omega",produces = {"application/xml"} )
	@ResponseBody
	public Iterable<omega> getomega(){
		
		return repo.findAll();
	}
	
	@RequestMapping("/omega/{uid}")
	@ResponseBody
	public Optional<omega> getomega1(@PathVariable("uid") int uid)
	{
		
		return repo.findById(uid);
	}
	
	@RequestMapping("/email/{eid}")
	@ResponseBody
	public Optional<omega> getemail(@PathVariable("eid") int eid)
	{
		
		return repo.findById(eid);
	}

}
