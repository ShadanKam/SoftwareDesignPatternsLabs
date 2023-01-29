
public interface Shape extends Cloneable {

	// private String id;
	// protected String type;

	public void draw();

	public double area();

	public Shape makeCopy();

	public String toString();
}
