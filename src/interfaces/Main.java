package interfaces;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.execute(new TestImplementation());
        main.execute(new TestImplementationTwo());
    }


    public void execute(TestInterface testInterface) {
        testInterface.helloWorld();
        testInterface.hiJava();
    }
}