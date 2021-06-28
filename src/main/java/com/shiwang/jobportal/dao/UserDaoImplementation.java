package com.shiwang.jobportal.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shiwang.jobportal.entity.User;

@Repository
public class UserDaoImplementation implements UserDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	@Transactional
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.openSession();
		currentsession.save(user);
	}

}
