/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.project.Controller;

import com.kamal.project.Service.ProjectService;
import com.kamal.entity.Project;
import com.kamal.project.DTO.ProjectDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kamal
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/")
public class ProjectController {

    @Autowired
    private ProjectService ps;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "project:index";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<ProjectDTO> getAll() {
        List<ProjectDTO> pdList = new ArrayList<>();
        for (Project project : ps.getAll()) {
            ProjectDTO pd = new ProjectDTO();
            pd.setpId(project.getPId());
            pd.setStartedDate(project.getStartedDate());
            pd.setEndDate(project.getEndDate());
            pd.setStatus(project.getStatus());
            pd.setcId(project.getCId());
            pdList.add(pd);
        }
        return pdList;
    }
}
