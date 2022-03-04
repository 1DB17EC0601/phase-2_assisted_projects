package com.demo.controllers;

import org.springframework.ui.ModelMap;


import com.demo.dao.EProductDAO;
import com.demo.entity.EProduct;

class MainController{
	
	
	private EProductDAO dao;

        @GetMapping(value="/product/{id}")
        {
        	EProduct pro=dao.getProductById(5);
        	map.addAttribute("object",pro);
        	return "updatePage";
        	
        }
        
}