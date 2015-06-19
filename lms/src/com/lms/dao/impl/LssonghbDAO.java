package com.lms.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Lssonghb;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lssonghb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.lms.domain.Lssonghb
 * @author MyEclipse Persistence Tools
 */
public class LssonghbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LssonghbDAO.class);
	// property constants
	public static final String XB = "xb";
	public static final String XKS = "xks";
	public static final String NUM = "num";
	public static final String MDBH = "mdbh";
	public static final String SJMC = "sjmc";
	public static final String CLPZ = "clpz";

	protected void initDao() {
		// do nothing
	}

	public void save(Lssonghb transientInstance) {
		log.debug("saving Lssonghb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Lssonghb persistentInstance) {
		log.debug("deleting Lssonghb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Lssonghb findById(java.lang.Integer id) {
		log.debug("getting Lssonghb instance with id: " + id);
		try {
			Lssonghb instance = (Lssonghb) getHibernateTemplate().get(
					"com.lms.domain.Lssonghb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Lssonghb instance) {
		log.debug("finding Lssonghb instance by example");
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
		log.debug("finding Lssonghb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Lssonghb as model where model."
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

	public List findByMdbh(Object mdbh) {
		return findByProperty(MDBH, mdbh);
	}

	public List findBySjmc(Object sjmc) {
		return findByProperty(SJMC, sjmc);
	}

	public List findByClpz(Object clpz) {
		return findByProperty(CLPZ, clpz);
	}

	public List findAll() {
		log.debug("finding all Lssonghb instances");
		try {
			String queryString = "from Lssonghb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Lssonghb merge(Lssonghb detachedInstance) {
		log.debug("merging Lssonghb instance");
		try {
			Lssonghb result = (Lssonghb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Lssonghb instance) {
		log.debug("attaching dirty Lssonghb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Lssonghb instance) {
		log.debug("attaching clean Lssonghb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LssonghbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LssonghbDAO) ctx.getBean("LssonghbDAO");
	}
}