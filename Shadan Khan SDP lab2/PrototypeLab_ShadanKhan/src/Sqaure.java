
public class Sqaure implements Shape {

	// 4) override maeCopy method()
	// 5) override ToString()

	public double height, width;

	public Sqaure(double Height, double Width) {
		this.height = Height;
		this.width = Width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height * width;
	}

	@Override
	public Shape makeCopy() {
		System.out.println("A square has been copied!");
		Sqaure sqaureObject = null;
		try {
			sqaureObject = (Sqaure) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sqaureObject;
	}

	@Override
	public String toString() {
		return "DONE!";
	}

}
