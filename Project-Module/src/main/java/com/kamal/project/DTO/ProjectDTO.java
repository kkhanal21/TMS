/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamal.project.DTO;

import com.kamal.entity.Client;
import java.util.Date;

/**
 *
 * @author kamal
 */
public class ProjectDTO {

    private Integer pId;
    private String pName;
    private Date startedDate;
    private Date endDate;
    private short status;
    private Client cId;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Client getcId() {
        return cId;
    }

    public void setcId(Client cId) {
        this.cId = cId;
    }

}
