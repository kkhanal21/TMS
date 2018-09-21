package com.kamal.entity;

import com.kamal.entity.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-01T16:41:04")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, String> pName;
    public static volatile SingularAttribute<Project, Date> endDate;
    public static volatile SingularAttribute<Project, Integer> pId;
    public static volatile SingularAttribute<Project, Date> startedDate;
    public static volatile SingularAttribute<Project, Short> status;
    public static volatile SingularAttribute<Project, Client> cId;

}