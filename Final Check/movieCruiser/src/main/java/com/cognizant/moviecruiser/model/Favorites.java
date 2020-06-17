package com.cognizant.moviecruiser.model;

import java.util.List;





public class Favorites {
	
	private int id;
	
	private int us_id;
	
	
	private int mv_id;

	public Favorites() {
		super();
	}

	public Favorites(int us_id, int mv_id) {
		super();
		this.us_id = us_id;
		this.mv_id = mv_id;
	}

	public Favorites(int id, int us_id, int mv_id) {
		super();
		this.id = id;
		this.us_id = us_id;
		this.mv_id = mv_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUs_id() {
		return us_id;
	}

	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}

	public int getMv_id() {
		return mv_id;
	}

	@Override
	public String toString() {
		return "Favorites [id=" + id + ", us_id=" + us_id + ", mv_id=" + mv_id + "]";
	}

	public void setMv_id(int mv_id) {
		this.mv_id = mv_id;
	}

	

}
