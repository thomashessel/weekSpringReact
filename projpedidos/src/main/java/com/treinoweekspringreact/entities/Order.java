package com.treinoweekspringreact.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private long id;
	private Date moment;
	private OrderStatus status;
	
	private Client cliente;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client cliente) {
		super();
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public double total () {
		double result=0.0;
		for (OrderItem orderItem : items) {
			result+=orderItem.subTotal();
		}
		return result;
	}
}
