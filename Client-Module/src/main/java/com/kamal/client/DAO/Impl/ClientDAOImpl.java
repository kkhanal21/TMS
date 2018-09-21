/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.client.DAO.Impl;

import com.kamal.client.DAO.ClientDAO;
import com.kamal.core.dao.Impl.GenericDAOImpl;
import com.kamal.entity.Client;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kamal
 */
@Repository(value = "ClientDAO")
public class ClientDAOImpl extends GenericDAOImpl<Client> implements ClientDAO {

}
