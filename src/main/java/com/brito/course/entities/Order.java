package com.brito.course.entities;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private User client;
	public Order() {
		
	}
	
	private long id;
	private Instant moment;
	private User client;

}
