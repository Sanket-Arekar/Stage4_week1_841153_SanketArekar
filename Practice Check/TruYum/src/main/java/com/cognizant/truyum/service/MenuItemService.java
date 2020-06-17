package com.cognizant.truyum.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.*;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {
	
	MenuItemDao md = new MenuItemDao();
	CartDao cd=new CartDao();
	
	public ArrayList<MenuItem> getMenuItem() {
		return md.getMenuItems();
	}
	
	public MenuItem getMenuItem(int id) {
		return md.findMenuItem(id);
	}
	
	public MenuItem save(MenuItem menuItem) {
		return md.save(menuItem);
	}
	
	public void addCartItem(int menuItemId) {
		menuItemId--;
		cd.addCartItem(menuItemId);
	}
	
	public List<MenuItem> getAllCartItems() {
		return cd.getAllCartItems();
	}
	
	public void removeFromCart(int id) {
		cd.removeFromCart(id);
	}
}
