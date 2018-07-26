package com.daalchini.ratings.service;

import org.springframework.stereotype.Repository;
import com.daalchini.ratings.model.OrderRatings;

/**
 * Check {@link OrderRatingsServiceImpl} for implementation details
 * 
 * @author Nitin Sharma
 *
 */
@Repository
public interface OrderRatingsService {

	public void saveOrderRatings(OrderRatings rating);
}
