public class FactoryProducer {
    public static Computer createComputer(ComputerFactory factory) {
        return factory.createComputer();
    }
}
