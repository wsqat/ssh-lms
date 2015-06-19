package com.lms.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lms.domain.Songhb;

/**
 * A data access object (DAO) providing persistence and search support for
 * Songhb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.lms.domain.Songhb
 * @author MyEclipse Persistence Tools
 */
public class SonghbDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SonghbDAO.class);
	// property constants
	public static final String MDBH = "mdbh";
	public static final String SJBH = "sjbh";
	public static final String CLBH = "clbh";

	protected void initDao() {
		// do nothing
	}

	public void save(Songhb transientInstance) {
		log.debug("saving Songhb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Songhb persistentInstance) {
		log.debug("deleting Songhb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Songhb findById(java.lang.Integer id) {
		log.debug("getting Songhb instance with id: " + id);
		try {
			Songhb instance = (Songhb) getHibernateTemplate().get(
					"com.lms.domain.Songhb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Songhb instance) {
		log.debug("finding Songhb instance by example");
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
		log.debug("finding Songhb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Songhb as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMdbh(Object mdbh) {
		return findByProperty(MDBH, mdbh);
	}

	public List findBySjbh(Object sjbh) {
		return findByProperty(SJBH, sjbh);
	}

	public List findByClbh(Object clbh) {
		return findByProperty(CLBH, clbh);
	}

	public List findAll() {
		log.debug("finding all Songhb instances");
		try {
			String queryString = "from Songhb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Songhb merge(Songhb detachedInstance) {
		log.debug("merging Songhb instance");
		try {
			Songhb result = (Songhb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Songhb instance) {
		log.debug("attaching dirty Songhb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Songhb instance) {
		log.debug("attaching clean Songhb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SonghbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SonghbDAO) ctx.getBean("SonghbDAO");
	}
}