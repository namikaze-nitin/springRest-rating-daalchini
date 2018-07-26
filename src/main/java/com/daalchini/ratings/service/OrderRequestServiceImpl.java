package com.daalchini.ratings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daalchin.ratings.dao.OrderRequestDAO;
import com.daalchini.ratings.model.OrderRequest;

/**
 * Service class for {@link OrderRequestDAO}.
 * 
 * @author Nitin Sharma
 *
 */
@Service
@Transactional
public class OrderRequestServiceImpl implements OrderRequestService{

	OrderRequestDAO orderReqDao;
	
	/**
	 * Constructor to autowire an object of type {@link OrderRequestDAO}.
	 * </br>
	 * Constructor injection is prefered over setter injections in spring development.
	 * 
	 * @param orderReqDao
	 */
	@Autowired
	public OrderRequestServiceImpl(OrderRequestDAO orderReqDao) {//Autowiring a constructor is prefered
		this.orderReqDao = orderReqDao;
	}
	
	/**
	 * Service method to persist {@link OrderRequest} object into database
	 * 
	 * @see OrderRequestDAO
	 * @author Nitin Sharma
	 */
	@Override
	public void saveOrderRequest(OrderRequest request) {
		this.orderReqDao.insertOrderRequest(request);
	}
}
