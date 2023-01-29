
public class TestCalChain {

	public static void main(String[] args) {

		// Create Chain: Add, Subtract, Multiply, then Divide.
		Chain add = new AddNumbers();
		Chain subtract = new SubtractNumbers();
		Chain multiply = new MultNumbers();
		Chain divide = new DivideNumbers();

		add.setNextChain(subtract);
		subtract.setNextChain(multiply);
		multiply.setNextChain(divide);

		// create request to add two numbers using the chain
		Numbers request = new Numbers(4, 2, "add");
		add.calculate(request);

		System.out.print("\n");

		// create request to multiply two numbers using the chain
		Numbers request2 = new Numbers(4, 2, "mult");
		add.calculate(request2);

		System.out.print("\n");

		// create request to subtract two numbers using the chain
		Numbers request3 = new Numbers(4, 2, "sub");
		add.calculate(request3);

		System.out.print("\n");

		// create request to divide two numbers using the chain
		Numbers request4 = new Numbers(4, 2, "div");
		add.calculate(request4);
		System.out.print("\n");

	}

}
