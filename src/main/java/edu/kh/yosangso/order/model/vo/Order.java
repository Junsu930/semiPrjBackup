package edu.kh.yosangso.order.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private String productName;
	private int memberNo;
	private String orderNo;
	private int price;
	private int buyingRate;
	private String refundDate;
	private String orderDate;
	private String address;
	
	public Order(String productName, String orderNo, int price, int buyingRate) {
		super();
		this.productName = productName;
		this.orderNo = orderNo;
		this.price = price;
		this.buyingRate = buyingRate;
	}

	public Order(String orderNo, String orderDate, String address) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.address = address;
	}
	
	
	
	
	public Order(String productName, int memberNo, String orderNo, int price, int buyingRate, String refundDate, String orderDate) {
		super();
		this.productName = productName;
		this.memberNo = memberNo;
		this.orderNo = orderNo;
		this.price = price;
		this.buyingRate = buyingRate;
		this.refundDate = refundDate;
		this.orderDate = orderDate;
	}


	public Order(String productName, int price, int buyingRate) {
		super();
		this.productName = productName;
		this.price = price;
		this.buyingRate = buyingRate;
	}




}