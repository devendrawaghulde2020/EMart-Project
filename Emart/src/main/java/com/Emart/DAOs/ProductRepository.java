package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.Product;
import com.Emart.Models.User;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{

}
