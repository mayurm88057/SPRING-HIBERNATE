package com.mayur.spring.ObjectRelational.mapping.springHibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mayur.spring.ObjectRelational.mapping.springHibernate.dao.ProductDao;
import com.mayur.spring.ObjectRelational.mapping.springHibernate.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("com/mayur/spring/ObjectRelational/mapping/springHibernate/test/Config.xml");
    ProductDao dao = (ProductDao) context.getBean("productdao");
    Product product = new Product();
    product.setId(2);
    product.setDescription("iphone");
    product.setName("nokia");
    product.setPrice(100);
	
    dao.create(product);
    
	}
}
