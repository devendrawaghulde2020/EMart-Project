package com.Emart.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.Cart;
import com.Emart.Models.User;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>
{
	public Cart save(Cart cart);
	public Cart deleteByProductId(int productId);
	public List<Cart> findAll();
}
