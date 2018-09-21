package com.kamal.entity;

import com.kamal.entity.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-01T16:41:04")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Date> createdDate;
    public static volatile SingularAttribute<Client, String> companyName;
    public static volatile CollectionAttribute<Client, Project> projectCollection;
    public static volatile SingularAttribute<Client, Integer> cId;
    public static volatile SingularAttribute<Client, Boolean> status;

}