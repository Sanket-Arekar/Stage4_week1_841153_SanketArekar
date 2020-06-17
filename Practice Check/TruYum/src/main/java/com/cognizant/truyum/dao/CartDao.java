package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDao {
	private final static Logger logger = LoggerFactory.getLogger(CartDao.class);
	public static ArrayList<Cart> cart = new ArrayList<Cart>();
	List<MenuItem> mov = new ArrayList<MenuItem>();
	
	@Autowired
	MenuItemDao menuItemDao;
	

	
	public CartDao() {
	}

	public void addCartItem(int menuItemId) {
		int idc=0;
		if(cart.isEmpty()) {
			idc = 0;
		} else {
			idc = cart.size(); 
		}
		 Cart fav = new Cart(idc,1,menuItemId);  
		 logger.info("Before adding to the Cart");
          cart.add(fav);
          for (Cart f : cart) {
  			MenuItem item = menuItemDao.findById(f.getC_id());
  			
  			if(!mov.contains(item)) {
  				mov.add(item);
  			}
  	         System.out.println(mov);
  	     }
  	
	}
	
	public List<MenuItem> getAllCartItems() throws EmptyFoundException {
		return mov;
	}

	public void removeFromCart(int id) {
		// TODO Auto-generated method stub
		int c=0;
		for(MenuItem m:mov) {
			if(m.getId() == id) {
				mov.remove(c);
			} else {
				c++;
			}
		}
	}
}