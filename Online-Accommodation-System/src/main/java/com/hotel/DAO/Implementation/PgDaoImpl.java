package com.hotel.DAO.Implementation;

	
	import java.util.List;

	import javax.persistence.criteria.Root;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;
	import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.hotel.DAO.PgDao;
	import com.hotel.model.Pg;

	@Repository
	public class PgDaoImpl implements PgDao {

		@Autowired
		private SessionFactory sessionFactory;

		public void add(Pg pg) {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(pg);
		}

		public void remove(String pgid) {
			sessionFactory.getCurrentSession().remove(pgid);

		}

	

		public Pg viewPg(String pgid) {
			return (Pg) sessionFactory.getCurrentSession().get(Pg.class, pgid);
		}

		public List<Pg> viewAll() {

			return (List<Pg>) sessionFactory.getCurrentSession().createQuery("from Pg").list();
		}

		public void update(String pgid) {
			sessionFactory.getCurrentSession().update(pgid);
		}

	}


