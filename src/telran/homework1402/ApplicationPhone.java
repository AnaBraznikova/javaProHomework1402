package telran.homework1402;

public class ApplicationPhone {

    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        phoneOne.setModel("Apple");
        phoneOne.setNumber("+3706589911");
        phoneOne.setWeight(240);
        phoneOne.setName("Kotov");

        Phone phoneTwo = new Phone();
        phoneTwo.setModel("Samsung");
        phoneTwo.setNumber("+3706942268");
        phoneTwo.setWeight(250);
        phoneTwo.setName("Boris");

        Phone phoneThird = new Phone();
        phoneThird.setModel("Xiaomi");
        phoneThird.setNumber("+3709471162");
        phoneThird.setWeight(255);
        phoneThird.setName("Naumov");
        String receiveCall = phoneThird.getReceiveCall();

//        System.out.println(phoneOne);
//        System.out.println(phoneTwo);
//        System.out.println(phoneThird);


//        System.out.println("Звонит " + phoneOne.getReceiveCall());
//        System.out.println("Звонит " + phoneTwo.getReceiveCall());
//        System.out.println("Звонит " + phoneThird.getReceiveCall());

        System.out.println("Звонит " + phoneOne.getNumber());
        System.out.println("Звонит " + phoneTwo.getNumber());
        System.out.println("Звонит " + phoneThird.getNumber());



    }
}
