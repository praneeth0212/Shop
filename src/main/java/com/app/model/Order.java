package com.app.model;

public class Order {
	private int order_id;
	private String order_status ;
	private int order_cust_id;
	private String order_date;
	private Cart cart;
	private Customer customer;
	private Product product;
	
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public int getOrder_cust_id() {
		return order_cust_id;
	}
	public void setOrder_cust_id(int order_cust_id) {
		this.order_cust_id = order_cust_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_status=" + order_status + ", order_cust_id=" + order_cust_id
				+ ", order_date=" + order_date + ", cart=" + cart + ", customer=" + customer + ", product=" + product
				+ "]";
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}
	
}
