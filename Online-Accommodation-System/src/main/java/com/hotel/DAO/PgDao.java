package com.hotel.DAO;



	import java.util.List;

	import com.hotel.model.Pg;

	public interface PgDao {
		
		public void add(Pg pg);
		public void remove(String pgid);
		public Pg viewPg(String pgid);
		public List<Pg> viewAll();
		public void update(String pgid);
	}

	

