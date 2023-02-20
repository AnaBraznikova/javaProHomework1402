package telran.homework1402;

public class ApplicationPerson {

    public static void main(String[] args) {

        Person personOne = new Person("Котов",  18);

        Person personTwo = new Person("Борзов", 25);


        System.out.println("Такой-то " + personOne.talk() + " говорит");
        System.out.println("Такой-то " + personTwo.talk() + " говорит");
    }
}
