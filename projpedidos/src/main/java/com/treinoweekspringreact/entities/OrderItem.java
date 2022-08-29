package com.treinoweekspringreact.entities;

public class OrderItem {

	private long id;
	private int quantity;
	private double price;
	
	private Product produto;
	
	public OrderItem() {
		
	}

	public OrderItem(int quantity, double price) {
		super();
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
