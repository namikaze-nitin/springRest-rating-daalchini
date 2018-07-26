package com.daalchin.ratings.dao;

import org.springframework.stereotype.Repository;
import com.daalchini.ratings.model.OrderRequest;

/**
 * Check {@link OrderRequestDAOImpl} for its implementation details.
 * 
 * @author sanji
 *
 */
@Repository
public interface OrderRequestDAO {
	
	public void insertOrderRequest(OrderRequest requestdetails);
}
