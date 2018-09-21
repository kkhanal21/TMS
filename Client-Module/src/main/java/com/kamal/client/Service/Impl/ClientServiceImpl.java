/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.client.Service.Impl;

import com.kamal.client.DAO.ClientDAO;
import com.kamal.client.Service.ClientService;
import com.kamal.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kamal
 */
@Service(value = "ClientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO cd;

    @Override
    public List<Client> getAll() {
        return cd.getAll();

    }

    @Override
    public Client getById(int id) {
        return cd.getById(id);
    }

    @Override
    public void insert(Client t) {
        cd.insert(t);
    }

    @Override
    public void update(Client t) {
        cd.update(t);
    }

    @Override
    public boolean delete(int id) {
        return cd.delete(id);
    }

}
