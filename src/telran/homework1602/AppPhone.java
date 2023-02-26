package telran.homework1602;


import java.util.Random;

public class AppPhone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.receiveCall();

        Samsung samsung = new Samsung();
        samsung.call();
        samsung.receiveCall();

        Apple apple = new Apple();
        apple.call();
        apple.receiveCall();

        Xiaomi xiaomi = new Xiaomi();
        xiaomi.call();
        xiaomi.receiveCall();

        System.out.println();


        Phone[] phones = {new Samsung("Samsung"), new Xiaomi("Xiaomi"), new Apple("Apple")};
        for (Phone sPhone : phones) {
            sPhone.call();
            sPhone.receiveCall();

        }

    }
}

