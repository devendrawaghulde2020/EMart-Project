package com.Emart.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Emart.Models.Product;
import com.Emart.Services.ProductService;

@RestController
@CrossOrigin(origins="*")
public class ProductController
{
      @Autowired
      private ProductService productService;
      
      @GetMapping(path= "/getProductById/{productId}")
      public Product getProductById(@PathVariable int productId)
      {
    	  return this.productService.getProductById(productId);
      }
      
      @GetMapping(path= "/getAllProducts/{catMasterId}")
      public List<Product> getByCategory(@PathVariable int catMasterId)
  	  {
  		  return this.productService.getByCategory(catMasterId);
  	  }
}
