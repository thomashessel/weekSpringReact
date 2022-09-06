package com.treinoweekspringreact.entities;

import java.io.Serializable;

public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private int quantity;
	private double price;
	
	private Product produto;
	
	public OrderItem() {
		
	}

	public OrderItem(long id,int quantity, double price) {
		super();
		this.id=id;
		this.quantity = quantity;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantity * price;
	}
}
