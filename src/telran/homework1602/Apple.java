package telran.homework1602;

public class Apple extends Phone {

    public Apple(String name) {
        this.name = name;
    }

    private String name;
    private String number;


    public Apple() {
    }

    @Override
    public void call() {
        //super.call("Phone " + name);
        System.out.println("Phone " + name + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
        //super.receiveCall();
        String number = null;
        System.out.println("Phone " + name + " receive call from " + "+" + getRandomNumber());
    }

}

