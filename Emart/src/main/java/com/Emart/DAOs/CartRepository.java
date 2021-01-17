package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.Cart;
import com.Emart.Models.User;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>
{
	
}
