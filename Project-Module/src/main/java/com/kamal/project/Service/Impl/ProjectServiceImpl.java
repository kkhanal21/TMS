/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.project.Service.Impl;

import com.kamal.entity.Project;
import com.kamal.project.DAO.ProjectDAO;
import com.kamal.project.Service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kamal
 */
@Service(value = "ProjectService")
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectDAO pd;

    @Override
    public List<Project> getAll() {
        return pd.getAll();

    }

    @Override
    public Project getById(int id) {
        return pd.getById(id);
    }

    @Override
    public void insert(Project t) {
        pd.insert(t);
    }

    @Override
    public void update(Project t) {
        pd.update(t);
    }

    @Override
    public boolean delete(int id) {
        return pd.delete(id);
    }
}
