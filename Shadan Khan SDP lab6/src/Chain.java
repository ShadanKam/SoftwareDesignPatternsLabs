


public interface Chain {

	// Either solves the problem or passes the data
	
	// to the next Object in the chain
	public void setNextChain(Chain nextChain);
 public void calculate(Numbers request);

}


