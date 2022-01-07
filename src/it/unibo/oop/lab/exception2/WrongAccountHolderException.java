package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7190620326792084901L;
    @Override
    public String toString() {
    	return "The user doesn't have access to this bank account!";
    }
    @Override
    public String getMessage() {
    	return this.toString();
    }
}
