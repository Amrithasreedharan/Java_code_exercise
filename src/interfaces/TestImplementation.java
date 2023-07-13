package interfaces;
public class TestImplementation implements TestInterface {
    @Override
    public void helloWorld() {
        System.out.println("Hello");
    }

    @Override
    public void hiJava() {
        System.out.println("Hi Java");
    }
}
