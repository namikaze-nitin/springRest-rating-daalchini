package com.daalchini.ratings.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Class defines structure of ratings provided in a {@link OrderRequest}
 * 
 * @author Nitin Sharma
 *
 */
@Component
@Entity
@Table(name="ORD_Ratings")
public class OrderRatings implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prdRatingId;
	
	@Column
	private String variant_id;

	@Column
	private byte rating_food;
	
	public String getVariant_id() {
		return variant_id;
	}
	public void setVariant_id(String variant_id) {
		this.variant_id = variant_id;
	}
	public byte getRating_food() {
		return rating_food;
	}
	public void setRating_food(byte rating_food) {
		this.rating_food = rating_food;
	}
	
	@Override
	public String toString() {
		return "OrderRatings [variant_id=" + this.variant_id + ", rating_food=" + this.rating_food + "]";
	}	
}