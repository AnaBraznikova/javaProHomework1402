package telran.homework1602;

public class Samsung extends Phone {



    private String name;

    public Samsung(String name) {
        this.name = name;
    }

    public Samsung() {
    }

    @Override
    public void call() {
       //super.call();
        System.out.println("Phone " + name + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
       // super.receiveCall();
        System.out.println("Phone " + name + " receive call from " + "+" + getRandomNumber());
    }

}




