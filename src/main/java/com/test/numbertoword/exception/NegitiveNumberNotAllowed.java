/**
 * 
 */
package com.test.numbertoword.exception;

/**
 * @author Dastagiri
 *
 */
public class NegitiveNumberNotAllowed extends Exception {

	/**
	 * 
	 */
	private String errorMessage;
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NegitiveNumberNotAllowed() {
		errorMessage = "In valid Number";
	}

	/**
	 * @param arg0
	 */
	public NegitiveNumberNotAllowed(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
