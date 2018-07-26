package com.daalchin.ratings.dao;

import org.springframework.stereotype.Repository;
import com.daalchini.ratings.model.OrderRatings;

/**
 * Check {@link OrderRatingsDAOImpl} for its implementation details.
 * 
 * @author Nitin Sharma
 *
 */
@Repository
public interface OrderRatingsDAO {

	public void insertProductRating(OrderRatings rating);
}
