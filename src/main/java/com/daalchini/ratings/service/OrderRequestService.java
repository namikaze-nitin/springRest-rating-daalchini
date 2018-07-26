package com.daalchini.ratings.service;

import org.springframework.stereotype.Repository;
import com.daalchini.ratings.model.OrderRequest;

/**
 * Check {@link OrderRequestServiceImpl} for implementation details.
 * 
 * @author Nitin Sharma
 *
 */
@Repository
public interface OrderRequestService {

	public void saveOrderRequest(OrderRequest request);
}
