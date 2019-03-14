package com.hotel.Service;
	import java.util.List;

	import com.hotel.model.Pg;

	public interface Pgservice {
		public void add(Pg pg);
		public void remove(String pgid);
		public Pg viewPg(String pgid);
		public List<Pg> viewAll();
		public void update(String  pgid);
	
	}



