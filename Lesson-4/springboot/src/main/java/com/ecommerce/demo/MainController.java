package com.ecommerce.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ecommerce.custom.ProductNotFoundException;

@Controller
public class MainController {
	
	@GetMapping(value="/test")
	
		public String test()
		{
			return "Hello world";
		}

	    @GetMapping(value = "/testproducts/{id}")
	    public String getProduct(@PathVariable("id") String id)
	    {
	        if(id.contentEquals("0"))
	        {
	            throw new ProductNotFoundException();
	        }
	        else
	        {
	            return "Product Found";
	        }
	    }
	}
	


