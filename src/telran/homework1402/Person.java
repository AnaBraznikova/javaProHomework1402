package telran.homework1402;

public class Person {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public Person(){

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    private String talk;

    public String talk() {
        return getFullName();
    }


}
