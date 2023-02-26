package telran.homework1602;

import java.util.Random;

public class Phone {

    public void call() {
        System.out.println();
    }

    public void receiveCall() {
        System.out.println();
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000000, 99999999);
        return randomNumber;
    }
}
