

public class AddNumbers implements Chain{
	private Chain nextChain;

	

	// Defines the next Object to receive the

	// data if this one can't use it
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}


	// Tries to calculate the data, or passes it

	// to the Object defined in method setNextChain()

	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){

			System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+

		                    (request.getNumber1()+request.getNumber2()));

		} else {
			nextChain.calculate(request);
			
		}

	}

}


