package javatraining.oletsky.demoobserver;

import java.util.ArrayList;

public class DemoObserver {
    public static void main(String[] args) {
        Source source = new Source();
        source.addListener(new ConcreteListener(1));
        source.addListener(new ConcreteListener(2));
        source.notifyListeners();
    }
}
