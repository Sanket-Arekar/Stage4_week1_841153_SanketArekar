package com.cognizant.truyum.dao;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDao  {
	private final static Logger logger = LoggerFactory.getLogger(MenuItemDao.class);	
	public static ArrayList<MenuItem> Menu_List = new ArrayList<MenuItem>();
	
	public MenuItemDao() {
		logger.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		Menu_List = context.getBean("menuList", java.util.ArrayList.class);
		logger.debug("Menu : {}", Menu_List.toString());
		logger.info("End");
	}

	public ArrayList<MenuItem> getMenuItems() {
		logger.info("Start");
		logger.info("End");
		return Menu_List;
	}

	
	public MenuItem findMenuItem(int id) {
		logger.info("Start");
		for(MenuItem g : Menu_List) {
			
			if(g.getId()==id) {
				logger.debug("Menu : {}", g.toString());
				logger.info("End");
				return g;
            }
        }
		logger.info("End");
		return null;
	}
	
	public MenuItem findById(int c_id) {
		MenuItem m=Menu_List.get(c_id);
		return m;
	}
	public MenuItem save(MenuItem menuItem) {
		logger.info("Start");
		logger.info("End");
			return menuItem;
	}

	
}
