package com.ip.client;

public class IpAddress {

	private long id;
	private String ipAddress;
	private String message;

	public IpAddress() {

	}

	/**
	 * @param id
	 * @param ipAddress
	 * @param message
	 */
	public IpAddress(long id, String ipAddress, String message) {
		super();
		this.id = id;
		this.ipAddress = ipAddress;
		this.message = message;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
