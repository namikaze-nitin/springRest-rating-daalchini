package com.daalchini.ratings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daalchini.ratings.model.OrderRatings;
import com.daalchini.ratings.model.OrderRequest;
import com.daalchini.ratings.model.OrderResponse;
import com.daalchini.ratings.service.OrderRatingsService;
import com.daalchini.ratings.service.OrderRequestService;

/**
 * Class is a {@link RestController} that accepts an {@link OrderRequest} and returns an {@link OrderResponse}.
 * </br>
 * One order can have multiple products.
 * </br>
 * Every {@link OrderRequest} consist of one {@link OrderRatings} per product in that order.
 * </br>
 * Every order can be provided a rating by the user and this controller handles actions to be carried out on them.
 * 
 * @author Nitin Sharma
 * 
 *
 */
@RestController
public class OrderRequestRatingController {

	OrderRatingsService orderRatingsService;
	OrderRequestService orderRequestService;
	
	/**
	 * Constructor to autowire data members elonging to {@link OrderRequestService} and {@link OrderRatingsService}.
	 * Constructor injection is preferrec over field injection in spring development.
	 * 
	 * @param orderRatingsService
	 * @param orderRequestService
	 */
	@Autowired
	public OrderRequestRatingController(OrderRatingsService orderRatingsService, OrderRequestService orderRequestService) {

		this.orderRatingsService = orderRatingsService;
		this.orderRequestService = orderRequestService;
	}
	
	private static String SUCCESS_STATUS = "SUCCESS";
	private static String SUCCESS_STATUS_CODE = "SS_0001";
	private static String SUCCESS_STATUS_MESSAGE = "SS_0001";	
	private static String ERROR_STATUS = "ERROR";
	private static String ERROR_STATUS_CODE = "ER_0001";
	private static String ERROR_STATUS_MESSAGE = "ER_0001";
	
	/**
	 * Method 'orderRequestRatingController' accepts json object as its param and returns a success or failure 
	 * message in json format depending on the type of request made.
	 * </br>
	 * One order can have multiple products.
	 * </br>
	 * Every {@link OrderRequest} consist of one {@link OrderRatings} per product in that order.
	 * </br>
	 * Every order can be provided a rating by the user and this controller handles actions to be carried out on them.
	 * </br>
	 * 
	 * @author Nitin Sharma
	 * @param ordReq : {@link OrderRequest}
	 * @return : {@link OrderResponse}
	 */
	@RequestMapping(value = "/ratingRequest", method= RequestMethod.POST)
	public OrderResponse orderRequestRatingController(@RequestBody OrderRequest ordReq) {

		OrderResponse ordRes = new OrderResponse();
		if(ordReq != null) {
			
			try {
				
				for(OrderRatings rat : ordReq.getRatings())
					orderRatingsService.saveOrderRatings(rat);
				
				orderRequestService.saveOrderRequest(ordReq);
				
				ordRes.setStatus(OrderRequestRatingController.SUCCESS_STATUS);
				ordRes.setStatusCode(OrderRequestRatingController.SUCCESS_STATUS_CODE);
				ordRes.setStatusMessage(OrderRequestRatingController.SUCCESS_STATUS_MESSAGE);
				
				return ordRes;
			}
			catch(Exception e) { e.printStackTrace(); }
		}

		ordRes.setStatus(OrderRequestRatingController.ERROR_STATUS);
		ordRes.setStatusCode(OrderRequestRatingController.ERROR_STATUS_CODE);
		ordRes.setStatusMessage(OrderRequestRatingController.ERROR_STATUS_MESSAGE);		
		
		return ordRes;
	}
}