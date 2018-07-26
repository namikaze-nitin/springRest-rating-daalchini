package com.daalchin.ratings.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daalchini.ratings.model.OrderRatings;

/**
 * Persist object of a {@link OrderRatings} class.
 * 
 * @author Nitin Sharma
 *
 */
@Service
public class OrderRatingsDAOImpl implements OrderRatingsDAO {

	
	SessionFactory sessionFactory;
	
	/**
	 * Constructor to autowire a data member of type {@link SessionFactory}.
	 * Constructor injection is prefered over field injection in spring development.
	 * 
	 * @param sessionFactory
	 */
	@Autowired
	public OrderRatingsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
	
	@Override
	public void insertProductRating(OrderRatings rating) {
		this.sessionFactory.getCurrentSession().save(rating);	
	}
}
