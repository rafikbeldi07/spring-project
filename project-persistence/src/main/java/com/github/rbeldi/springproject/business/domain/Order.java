package com.github.rbeldi.springproject.business.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author <a href="mailto:beldi.rafik.07@gmail.com">Rafik BELDI</a>
 *
 */

@Entity
public class Order implements Serializable {

	private static final long serialVersionUID = 7630706213451578192L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrder;

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
}