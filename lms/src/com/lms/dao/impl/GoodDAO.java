package com.lms.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Good;

/**
 * A data access object (DAO) providing persistence and search support for Good
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.lms.domain.Good
 * @author MyEclipse Persistence Tools
 */
public class GoodDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GoodDAO.class);
	// property constants
	public static final String XB = "xb";
	public static final String KS = "ks";
	public static final String MS = "ms";
	public static final String COLOR = "color";
	public static final String NUM = "num";
	public static final String PRICE = "price";
	public static final String DBH = "dbh";

	protected void initDao() {
		// do nothing
	}

	public void save(Good transientInstance) {
		log.debug("saving Good instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Good persistentInstance) {
		log.debug("deleting Good instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Good findById(java.lang.Integer id) {
		log.debug("getting Good instance with id: " + id);
		try {
			Good instance = (Good) getHibernateTemplate().get(
					"com.lms.domain.Good", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Good instance) {
		log.debug("finding Good instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Good instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Good as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXb(Object xb) {
		return findByProperty(XB, xb);
	}

	public List findByKs(Object ks) {
		return findByProperty(KS, ks);
	}

	public List findByMs(Object ms) {
		return findByProperty(MS, ms);
	}

	public List findByColor(Object color) {
		return findByProperty(COLOR, color);
	}

	public List findByNum(Object num) {
		return findByProperty(NUM, num);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByDbh(Object dbh) {
		return findByProperty(DBH, dbh);
	}

	public List findAll() {
		log.debug("finding all Good instances");
		try {
			String queryString = "from Good";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Good merge(Good detachedInstance) {
		log.debug("merging Good instance");
		try {
			Good result = (Good) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Good instance) {
		log.debug("attaching dirty Good instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Good instance) {
		log.debug("attaching clean Good instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GoodDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GoodDAO) ctx.getBean("GoodDAO");
	}
}