package com.daalchini.ratings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daalchin.ratings.dao.OrderRatingsDAO;
import com.daalchini.ratings.model.OrderRatings;

/**
 * Service class for {@link OrderRatingsDAO}
 * 
 * @author Nitin Sharma
 *
 */
@Service
@Transactional
public class OrderRatingsServiceImpl implements OrderRatingsService{

	OrderRatingsDAO orderRatingsDAO;
	
	/**
	 * Constructor to autowire an object of {@link OrderRatingsDAO}
	 * </br>
	 * Constructor injection is prefered over field injection in spring development.
	 *  
	 * @param orderRatingsDAO
	 */
	@Autowired
	public OrderRatingsServiceImpl(OrderRatingsDAO orderRatingsDAO) {
		this.orderRatingsDAO = orderRatingsDAO;		
	}

	/**
	 * Sevice method to persist {@link OrderRatings} object into database.
	 * 
	 * @see OrderRatingsDAO
	 * @author Nitin Sharma
	 */
	@Override
	public void saveOrderRatings(OrderRatings rating) {
		orderRatingsDAO.insertProductRating(rating);
	}
}
