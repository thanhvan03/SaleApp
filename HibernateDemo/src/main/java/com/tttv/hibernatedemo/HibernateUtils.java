/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tttv.hibernatedemo;

import com.tttv.pojo.Category;
import com.tttv.pojo.Comment;
import com.tttv.pojo.OrderDetail;
import com.tttv.pojo.ProdTag;
import com.tttv.pojo.Product;
import com.tttv.pojo.SaleOrder;
import com.tttv.pojo.Tag;
import com.tttv.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author PC
 */
public class HibernateUtils {
    private static final SessionFactory factory;
    
    static{
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
//        Properties props = new Properties();
//        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL, "jdbc:mysql://localhost/saledb");
//        props.put(Environment.USER, "root");
//        props.put(Environment.PASS, "ThV@n003");
//        props.put(Environment.SHOW_SQL, "true");
//        conf.setProperties(props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(ProdTag.class);
        
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(registry);
        
    }
    
    public static SessionFactory getFactory() {
        return factory;
    }

}
