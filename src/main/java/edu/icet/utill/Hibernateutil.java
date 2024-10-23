package edu.icet.utill;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Hibernateutil {
    private static SessionFactory sessionFactory=CreateSession();

    private static SessionFactory CreateSession() {
        StandardServiceRegistry build =new StandardServiceRegistryBuilder().configure("hibernateutil.cfg.xml").build();

        Metadata metadata =new metadataSourses(build)




    }


}
