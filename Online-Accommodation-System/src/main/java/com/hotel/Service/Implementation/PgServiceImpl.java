



	package com.hotel.Service.Implementation;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.hotel.Service.Pgservice;
	import com.hotel.DAO.PgDao;
	import com.hotel.model.Pg;

	@Service
	public class PgServiceImpl implements Pgservice {

		@Autowired
		private PgDao pgDao;

		@Transactional
		public void add(Pg pg) {
			pgDao.add(pg);
		}

		@Transactional
		public void remove(String pgid) {
			pgDao.remove(pgid);
		}

		@Transactional
		public Pg viewPg(String pgid) {

			return pgDao.viewPg(pgid);
		}

		@Transactional
		public List<Pg> viewAll() {

			return pgDao.viewAll();
		}

		@Transactional
		public void update(String pgid) {
			pgDao.update(pgid);
		}
	}


