package interfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestImplementationTwo implements TestInterface {
    @Override
    public void helloWorld() {
        System.out.println("Hello world");

       /* Map<String, String> m = new HashMap();
        Map<String, String> linked = new LinkedHashMap<>();
        Map<String, String> tree = new TreeMap<>();*/

    }

    @Override
    public void hiJava() {
        System.out.println("Hello Java");
    }
}
