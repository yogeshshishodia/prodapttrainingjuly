package com.prodapt.daytwo.order;

public class Order {
	private int orderId;
	private String orderDetails;
	//Has A
	private Product product;
	//private List<Product> productList;
	/**
	 * @param orderId
	 * @param orderDetails
	 */
	public Order(int orderId, String orderDetails) {
		this.orderId = orderId;
		this.orderDetails = orderDetails;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderDetails
	 */
	public String getOrderDetails() {
		return orderDetails;
	}
	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDetails=" + orderDetails + ", product=" + product + "]";
	}
	
	
}
