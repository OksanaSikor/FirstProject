package lesson6;

public class Phone {

    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this (number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит  "+ name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит "+ name + " номер " + number);
    }

    String getNumber() {
        return number;
    }

    public void sendMessage (String... number){
        for (int i = 0; i < number.length;i++){
            System.out.println(number[i]);
        }
    }

}
