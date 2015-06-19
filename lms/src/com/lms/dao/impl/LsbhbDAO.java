package com.lms.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Lsbhb;

/**
 * A data access object (DAO) providing persistence and search support for Lsbhb
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.lms.domain.Lsbhb
 * @author MyEclipse Persistence Tools
 */
public class LsbhbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LsbhbDAO.class);
	// property constants
	public static final String XKS = "xks";
	public static final String XB = "xb";
	public static final String NUM = "num";
	public static final String MDBH = "mdbh";

	protected void initDao() {
		// do nothing
	}

	public void save(Lsbhb transientInstance) {
		log.debug("saving Lsbhb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Lsbhb persistentInstance) {
		log.debug("deleting Lsbhb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Lsbhb findById(java.lang.Integer id) {
		log.debug("getting Lsbhb instance with id: " + id);
		try {
			Lsbhb instance = (Lsbhb) getHibernateTemplate().get(
					"com.lms.domain.Lsbhb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Lsbhb instance) {
		log.debug("finding Lsbhb instance by example");
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
		log.debug("finding Lsbhb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Lsbhb as model where model."
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

	public List findByMdbh(Object mdbh) {
		return findByProperty(MDBH, mdbh);
	}

	public List findAll() {
		log.debug("finding all Lsbhb instances");
		try {
			String queryString = "from Lsbhb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Lsbhb merge(Lsbhb detachedInstance) {
		log.debug("merging Lsbhb instance");
		try {
			Lsbhb result = (Lsbhb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Lsbhb instance) {
		log.debug("attaching dirty Lsbhb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Lsbhb instance) {
		log.debug("attaching clean Lsbhb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LsbhbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LsbhbDAO) ctx.getBean("LsbhbDAO");
	}
}