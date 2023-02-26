package telran.homework1602;

public class Xiaomi extends Phone {
    private String name;


    public Xiaomi(String name) {
        this.name = name;
    }

    public Xiaomi() {

    }


    @Override
    public void call() {
        // super.call();
        System.out.println("Phone " + name + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
        System.out.println("Phone " + name + " receive call from " + "+" + getRandomNumber());
    }

}
