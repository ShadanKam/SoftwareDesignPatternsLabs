
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape1 = new Circle(5);

		Shape shape2 = new Sqaure(2, 3);

		System.out.println("Shape 1 area is  " + shape1.area());

		shape1.draw();

		shape1.makeCopy();
		shape1.toString();

		System.out.println("Shape 2 area is  " + shape2.area());

		shape2.draw();

		shape2.makeCopy();
		shape2.toString();
	}

}
