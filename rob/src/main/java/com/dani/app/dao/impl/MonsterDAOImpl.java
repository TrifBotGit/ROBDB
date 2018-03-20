package com.dani.app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dani.app.dao.MonsterDAO;
import com.dani.app.model.Monster;
@Repository
public class MonsterDAOImpl implements MonsterDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public Monster getByName(String name) {
		String sql = "FROM Monster WHERE name=:name";
		Query query = em.createQuery(sql);
		query.setParameter("name", name);
		return (Monster) query.getSingleResult();
	}

}
