package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;
    @Override
    public String toString() {
    	return "Not enough funds on bank account! Transaction canceled!";
    }
    @Override
    public String getMessage() {
    	return this.toString();
    }
}
