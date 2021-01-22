package com.Emart.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Emart.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>
{
	public Product findById(int id);     //Find product by Id
	
	@Query("From Product p where p.categoryMasterId=?1")
	public List<Product> findByCategory(int id);
}
