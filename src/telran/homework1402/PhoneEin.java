package telran.homework1402;

public class PhoneEin {


    private String number;

    private String model;
    private int weight;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", receiveCall='" + receiveCall + '\'' +
                '}';
    }

    private String receiveCall;

    public String getReceiveCall() {
        return getName();
    }
}


