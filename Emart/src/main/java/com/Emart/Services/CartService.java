package com.Emart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emart.DAOs.CartRepository;
import com.Emart.Models.Cart;

@Service
public class CartService 
{
	@Autowired
	private CartRepository cartRepo;
	
	public Cart addToCart(Cart cart)
	{
		return this.cartRepo.save(cart);
	}
	
	public Cart deleteCartProduct(int productId)
	{
		return this.cartRepo.deleteByProductId(productId);
	}
	
	public List<Cart> getAllCartProducts()
	{
		return this.cartRepo.findAll();
	}
}
