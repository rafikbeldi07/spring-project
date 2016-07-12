package com.github.rbeldi.springproject.application;

/**
 * Global root abstract Application {@link Exception} to be thrown by all of this application entities Exception
 * 
 * @author <a href="mailto:beldi.rafik.07@gmail.com">Rafik BELDI</a>
 *
 */
public abstract class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = -3645119652381479874L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(String message) {
		super(message);
	}
}
