/**
 * 
 */
package com.denali.dci.model;

/**
 * @author zentere
 *
 */
public class Account {

	private Integer id;
	private Integer customerId;
	private String number;

	/**
	 * @param id
	 * @param customerId
	 * @param number
	 */
	public Account(Integer id, Integer customerId, String number) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
