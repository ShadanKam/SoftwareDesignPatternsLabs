
public class TestObserver {


	public static void main(String[] args){

		//change IBM price to 197.00  and AAPL price to 677.00 and GOOG price to 676.00 
		// and notify observers 
		StockGrabber subject = new StockGrabber();
		Observer obs = new StockObserver(subject);

		System.out.println("Changing stock to 197 IBM, 677 AAPL, 676 GOOG..");
		subject.setIBMPrice(197);
		subject.setAAPLPrice(677);
		subject.setGOOGPrice(676);

		subject.notifyObserver();

		

		// Delete one of the observers
		subject.unregister(obs);		
		

	}

}


