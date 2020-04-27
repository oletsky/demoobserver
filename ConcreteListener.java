package javatraining.oletsky.demoobserver;

public class ConcreteListener implements Listener {
    private int id;

    public ConcreteListener(int id) {
        this.id = id;
    }

    @Override
    public void listen() {
        System.out.println("Listener "+id+" reacted");
    }
}
