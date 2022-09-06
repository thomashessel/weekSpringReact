package com.treinoweekspringreact.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date moment;
	private OrderStatus status;
	
	private Client cliente;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
		
	}

	public Order(Long id,Date moment, OrderStatus status, Client cliente) {
		super();
		this.id=id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<OrderItem> getItems() {
		return items;
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
