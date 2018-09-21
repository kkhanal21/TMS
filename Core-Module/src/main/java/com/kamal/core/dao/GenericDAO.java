/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.core.dao;

import java.util.List;

/**
 *
 * @author kamal
 */
public interface GenericDAO<T> {

    List<T> getAll();

    T getById(int id);

    void insert(T t);

    void update(T t);

    boolean delete(int id);
}
