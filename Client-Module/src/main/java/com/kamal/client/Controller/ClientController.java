/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.client.Controller;

import com.kamal.client.DTO.CLientDTO;
import com.kamal.client.Service.ClientService;
import com.kamal.entity.Client;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ClientController {

    @Autowired
    private ClientService cs;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index(Model model) {
        model.addAttribute("cList", cs.getAll());
        return "client:index";
    }

//    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
//    @ResponseBody
//    public List<CLientDTO> getAll() {
//        List<CLientDTO> cdList = new ArrayList<>();
//        for (Client client : cs.getAll()) {
//            CLientDTO cd = new CLientDTO();
//            cd.setcId(client.getCId());
//            cd.setCompanyName(client.getCompanyName());
//            cd.setStatus(client.getStatus());
//            cdList.add(cd);
//        }
//        return cdList;
// 
//     }
}
