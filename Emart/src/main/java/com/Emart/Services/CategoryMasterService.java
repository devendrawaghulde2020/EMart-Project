package com.Emart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emart.DAOs.CategoryMasterRepository;
import com.Emart.Models.CategoryMaster;

@Service
public class CategoryMasterService 
{
	@Autowired
	private CategoryMasterRepository catMasterRepo;
	
	public List<CategoryMaster> getAllCategories()
	{
		return this.catMasterRepo.findAllCategories();
	}
	
	
	public List<CategoryMaster> getAllSubCategories(String id)
	{
		return this.catMasterRepo.findByCategoryId(id);
	}
}
