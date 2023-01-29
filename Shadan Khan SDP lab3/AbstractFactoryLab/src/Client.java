
public class Client {

	public static void main(String[] args) {

		Computer pc = FactoryProducer.createComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

		System.out.print("\n PC Factory:\n" + pc);

		Computer server = FactoryProducer.createComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

		System.out.print("\n \n Server Factory:\n" + server);

	}

}
