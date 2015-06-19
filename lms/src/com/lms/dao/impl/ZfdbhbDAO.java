package com.lms.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Zfdbhb;

/**
 * A data access object (DAO) providing persistence and search support for
 * Zfdbhb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.lms.domain.Zfdbhb
 * @author MyEclipse Persistence Tools
 */
public class ZfdbhbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ZfdbhbDAO.class);
	// property constants
	public static final String XB = "xb";
	public static final String XKS = "xks";
	public static final String NUM = "num";
	public static final String PRICE = "price";
	public static final String MDBH = "mdbh";
	public static final String IS_SOLVE = "isSolve";

	protected void initDao() {
		// do nothing
	}

	public void save(Zfdbhb transientInstance) {
		log.debug("saving Zfdbhb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zfdbhb persistentInstance) {
		log.debug("deleting Zfdbhb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zfdbhb findById(java.lang.Integer id) {
		log.debug("getting Zfdbhb instance with id: " + id);
		try {
			Zfdbhb instance = (Zfdbhb) getHibernateTemplate().get(
					"com.lms.domain.Zfdbhb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zfdbhb instance) {
		log.debug("finding Zfdbhb instance by example");
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
		log.debug("finding Zfdbhb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zfdbhb as model where model."
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

	public List findByXks(Object xks) {
		return findByProperty(XKS, xks);
	}

	public List findByNum(Object num) {
		return findByProperty(NUM, num);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByMdbh(Object mdbh) {
		return findByProperty(MDBH, mdbh);
	}

	public List findByIsSolve(Object isSolve) {
		return findByProperty(IS_SOLVE, isSolve);
	}

	public List findAll() {
		log.debug("finding all Zfdbhb instances");
		try {
			String queryString = "from Zfdbhb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zfdbhb merge(Zfdbhb detachedInstance) {
		log.debug("merging Zfdbhb instance");
		try {
			Zfdbhb result = (Zfdbhb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zfdbhb instance) {
		log.debug("attaching dirty Zfdbhb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zfdbhb instance) {
		log.debug("attaching clean Zfdbhb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZfdbhbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZfdbhbDAO) ctx.getBean("ZfdbhbDAO");
	}
}