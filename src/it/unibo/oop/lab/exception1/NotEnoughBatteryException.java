package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = -288979685441144222L;
	
    @Override
    public String toString() {
    	return "Cannot move because battery is depleted";
    }
    @Override
    public String getMessage() {
    	return this.toString();
    }
}
