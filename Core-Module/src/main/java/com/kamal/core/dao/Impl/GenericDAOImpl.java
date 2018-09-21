/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.core.dao.Impl;

import com.kamal.core.dao.GenericDAO;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kamal
 */
public class GenericDAOImpl<T> implements GenericDAO<T> {
     @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    private final Class<T> persistClass;

    public GenericDAOImpl() {
        persistClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> getAll() {
        session = sessionFactory.openSession();
        return session.createCriteria(persistClass).list();
    }

    @Override
    public T getById(int id) {
        session = sessionFactory.openSession();
        return (T) session.get(persistClass, id);
    }

    @Override
    public void insert(T t) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(t);
    }

    @Override
    public void update(T t) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.update(t);
    }

    @Override
    public boolean delete(int id) {
        boolean success = false;
        session = sessionFactory.openSession();
        T t = (T) session.get(persistClass, id);
        if (t != null) {
            trans = session.beginTransaction();
            session.delete(t);
            trans.commit();
            success = true;
        }
        return success;
    }

}
