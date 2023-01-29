
abstract class ToppingDecorator implements Pizza {
	protected Pizza newPizza;

	// Assigns the type instance to this attribute
	// of a Pizza	
	// All decorators can dynamically customize the Pizza
	// instance PlainPizza because of this

	public ToppingDecorator(Pizza newPizza) {
		this.newPizza = newPizza;
	}
	
	public String getDescription() {

		return newPizza.getDescription();
	}


	public double getCost() {

		return newPizza.getCost();
	}

	
	

}

