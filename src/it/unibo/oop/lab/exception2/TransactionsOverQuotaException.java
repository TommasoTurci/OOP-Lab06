package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186015990336694793L;
    @Override
    public String toString() {
    	return "Transaction count is greater than the maximum allowed transactions!";
    }
    @Override
    public String getMessage() {
    	return this.toString();
    }

}
