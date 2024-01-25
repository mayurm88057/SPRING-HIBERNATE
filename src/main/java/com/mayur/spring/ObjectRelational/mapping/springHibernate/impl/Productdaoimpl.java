package com.mayur.spring.ObjectRelational.mapping.springHibernate.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mayur.spring.ObjectRelational.mapping.springHibernate.dao.ProductDao;
import com.mayur.spring.ObjectRelational.mapping.springHibernate.entity.Product;

@Component("productdao")
public class Productdaoimpl implements ProductDao {

	@Autowired
	org.springframework.orm.hibernate5.HibernateTemplate hibernatetemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernatetemplate.save(product);
		return result;
	}

}
