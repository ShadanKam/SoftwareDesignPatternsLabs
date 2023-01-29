
public class Circle implements Shape {

	// 2) override maeCopy method()
	// 3) override ToString()

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public Shape makeCopy() {
		System.out.println("A circle has been copied!");
		Circle circleObject = null;
		try {
			circleObject = (Circle) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return circleObject;

	}
	@Override
	public String toString() {
		return "DONE!";
	}

}
