package com.Emart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emart.DAOs.ProductRepository;
import com.Emart.Models.Product;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productrepository;
	
	public Product getProductById(int id)
	{
		return productrepository.findById(id);
	}
	
	public List<Product> getByCategory(int id)
	{
		return this.productrepository.findByCategory(id);
	}

}
