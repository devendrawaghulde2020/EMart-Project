package com.Emart.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Emart.Models.CategoryMaster;
import com.Emart.Services.CategoryMasterService;

@RestController
@CrossOrigin(origins="*")
public class CategoryMasterController
{
	@Autowired
	private CategoryMasterService catMasterService;

    @GetMapping(path="/allCategories")            //where subCategory=NULL
     public List<CategoryMaster> getAllCategories()
     {
    	 return this.catMasterService.getAllCategories();
     }
    
     
     @GetMapping(path="/allSubCategories/{id}")
     public List<CategoryMaster> getAllSubCategories(@PathVariable String id)
     {
    	 System.out.println(id);
    	 return this.catMasterService.getAllSubCategories(id);
     }
}
