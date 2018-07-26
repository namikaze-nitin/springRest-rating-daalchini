package com.daalchin.ratings.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.daalchini.ratings.model.OrderRequest;

/**
 * Persist object of a {@link OrderRequest} class.
 * 
 * @author Nitin Sharma
 *
 */
@Service
public class OrderRequestDAOImpl implements OrderRequestDAO{

	SessionFactory sessionFactory;
	
	/**
	 * Constructor to autowire a data member of type {@link SessionFactory}.
	 * Constructor injection is preferred over field injection in spring development.
	 * 
	 * @param sessionFactory
	 */
	@Autowired
	public OrderRequestDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
	
	@Override
	public void insertOrderRequest(OrderRequest requestdetails) {
		this.sessionFactory.getCurrentSession().save(requestdetails);
	}
}
