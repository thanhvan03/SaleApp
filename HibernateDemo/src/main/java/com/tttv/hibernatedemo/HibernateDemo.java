/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tttv.hibernatedemo;

import com.tttv.pojo.Category;
import com.tttv.pojo.Product;
import com.tttv.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class HibernateDemo {

    public static void main(String[] args) {
        
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        
        Map<String, String> params = new HashMap<>();
        params.put("kw", "iPhone");
        params.put("fromPrice", "17000000");
        params.put("toPrice", "17000000");
        
        s.getProducts(params).forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice()));
        
        
        
        
//        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query  q = s.createNamedQuery("Product.findAll");
//            List<Product> products = q.getResultList();
//            products.forEach(p -> System.out.println(p.getName()));
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
    }
}
