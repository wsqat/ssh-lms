package com.lms.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Zlstjb;

/**
 * A data access object (DAO) providing persistence and search support for
 * Zlstjb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.lms.domain.Zlstjb
 * @author MyEclipse Persistence Tools
 */
public class ZlstjbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ZlstjbDAO.class);
	// property constants
	public static final String XKS = "xks";
	public static final String XB = "xb";
	public static final String NUM = "num";

	protected void initDao() {
		// do nothing
	}

	public void save(Zlstjb transientInstance) {
		log.debug("saving Zlstjb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zlstjb persistentInstance) {
		log.debug("deleting Zlstjb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zlstjb findById(java.lang.Integer id) {
		log.debug("getting Zlstjb instance with id: " + id);
		try {
			Zlstjb instance = (Zlstjb) getHibernateTemplate().get(
					"com.lms.domain.Zlstjb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zlstjb instance) {
		log.debug("finding Zlstjb instance by example");
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
		log.debug("finding Zlstjb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zlstjb as model where model."
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

	public List findAll() {
		log.debug("finding all Zlstjb instances");
		try {
			String queryString = "from Zlstjb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zlstjb merge(Zlstjb detachedInstance) {
		log.debug("merging Zlstjb instance");
		try {
			Zlstjb result = (Zlstjb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zlstjb instance) {
		log.debug("attaching dirty Zlstjb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zlstjb instance) {
		log.debug("attaching clean Zlstjb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZlstjbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZlstjbDAO) ctx.getBean("ZlstjbDAO");
	}
}