package com.lms.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Szjlb;

/**
 * A data access object (DAO) providing persistence and search support for Szjlb
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.lms.domain.Szjlb
 * @author MyEclipse Persistence Tools
 */
public class SzjlbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SzjlbDAO.class);
	// property constants
	public static final String XKS = "xks";
	public static final String XB = "xb";
	public static final String NUM = "num";
	public static final String PRICE = "price";
	public static final String MDBH = "mdbh";

	protected void initDao() {
		// do nothing
	}

	public void save(Szjlb transientInstance) {
		log.debug("saving Szjlb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Szjlb persistentInstance) {
		log.debug("deleting Szjlb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Szjlb findById(java.lang.Integer id) {
		log.debug("getting Szjlb instance with id: " + id);
		try {
			Szjlb instance = (Szjlb) getHibernateTemplate().get(
					"com.lms.domain.Szjlb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Szjlb instance) {
		log.debug("finding Szjlb instance by example");
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
		log.debug("finding Szjlb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Szjlb as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXks(Object xks) {
		return findByProperty(XKS, xks);
	}

	public List findByXb(Object xb) {
		return findByProperty(XB, xb);
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

	public List findAll() {
		log.debug("finding all Szjlb instances");
		try {
			String queryString = "from Szjlb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Szjlb merge(Szjlb detachedInstance) {
		log.debug("merging Szjlb instance");
		try {
			Szjlb result = (Szjlb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Szjlb instance) {
		log.debug("attaching dirty Szjlb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Szjlb instance) {
		log.debug("attaching clean Szjlb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SzjlbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SzjlbDAO) ctx.getBean("SzjlbDAO");
	}
}