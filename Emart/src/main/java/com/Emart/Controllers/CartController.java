package com.Emart.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Emart.Models.Cart;
import com.Emart.Services.CartService;

@RestController
@CrossOrigin(origins="*")
public class CartController 
{
	@Autowired
	private CartService cartService;
	
	@PostMapping(path="/addToCart")
	public Cart addToCart(@RequestBody Cart cart)
	{
		return this.cartService.addToCart(cart);
	}
	
	@PostMapping(path="/deleteCartProduct/{productId}")
	public Cart deleteCartProduct(@PathVariable int productId)
	{
		return this.cartService.deleteCartProduct(productId);
	}
	
	@GetMapping(path="/getAllCartProducts")
	public List<Cart> getAllCartProducts()
	{
		return this.cartService.getAllCartProducts();
	}
}
