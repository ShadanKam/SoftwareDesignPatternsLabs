
import java.util.ArrayList;

// Uses the Subject interface to update all Observers

public class StockGrabber implements Subject{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber(){

		// Creates an ArrayList to hold all observers

		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	public void unregister(Observer deleteObserver) {

		// Get the index of the observer to delete

		int observerIndex = observers.indexOf(deleteObserver);
	
		// Print out message (Have to increment index to match)

		System.out.println("Observer " + (observerIndex+2) + " deleted");
		
		observers.remove(deleteObserver);
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	
	}


	public void setIBMPrice(double newIBMPrice){

		this.ibmPrice = newIBMPrice;


	}

	public void setAAPLPrice(double newAAPLPrice){

		this.aaplPrice = newAAPLPrice;


	}
	

	public void setGOOGPrice(double newGOOGPrice){

		this.googPrice = newGOOGPrice;

	

	}

}

