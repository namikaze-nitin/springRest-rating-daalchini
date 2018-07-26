package com.daalchini.ratings.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.daalchini.ratings.controller.OrderRequestRatingController;

/**
 * CLass defines structure of Request made to {@link OrderRequestRatingController} in json format
 * 
 * @author sanji
 *
 */
@Component
@Entity
@Table(name="ORD_Request")
public class OrderRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String orderNo;
	
	@Column
	private int rateOverAllExperience;

	@Column
	private String apiName;

	@Column
	private Double apiVersion;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderRatings> ratings;
	
	public List<OrderRatings> getRatings() {
		return ratings;
	}
	public void setRatings(List<OrderRatings> ratings) {
		this.ratings = ratings;
	}
	private String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public int getRateOverAllExperience() {
		return rateOverAllExperience;
	}
	public void setRateOverAllExperience(int rateOverAllExperience) {
		this.rateOverAllExperience = rateOverAllExperience;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public Double getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(Double apiVersion) {
		this.apiVersion = apiVersion;
	}
	
	@Override
	public String toString() {
		return "OrderRequest [orderNo=" + this.orderNo + ", rateOverAllExperience=" + this.rateOverAllExperience + ", apiName="
				+ this.apiName + ", apiVersion=" + this.apiVersion + ", ratings=" + this.ratings.toString() + "]";
	}	
}
