package javatraining.oletsky.demoobserver;

import java.util.ArrayList;

public class Source {

    private ArrayList<Listener>  listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        for (var listener:listeners) {
            listener.listen();
        }
    }

}
