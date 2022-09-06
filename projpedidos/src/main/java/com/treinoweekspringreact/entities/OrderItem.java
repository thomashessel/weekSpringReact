package com.treinoweekspringreact.entities;

import java.io.Serializable;

public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private int quantity;
	private Double price;
	
	private Product produto;
	
	public OrderItem() {
		
	}

	public OrderItem(long id,int quantity, double price) {
		super();
		this.id=id;
		this.quantity = quantity;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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
