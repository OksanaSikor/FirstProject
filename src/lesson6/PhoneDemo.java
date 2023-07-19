package lesson6;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375291234568", "Apple", 10.3);
        phone1.receiveCall("Мама", "+375291234568" );
        System.out.println(phone1.getNumber() + " " + phone1.model + " " + phone1.weight );
        System.out.println();

        Phone phone2 = new Phone("+375291111111", "Samsung");
        phone2.weight = 8.4;
        phone2.receiveCall("Подруга");
        System.out.println(phone2.getNumber() + " " + phone2.model + " " + phone2.weight );
        System.out.println();

        Phone phone3 = new Phone();
        phone3.number = "+375292222222";
        phone3.model = "Xiaomi";
        phone3.weight = 12.5;
        phone3.receiveCall("Света");
        System.out.println(phone3.getNumber() + " " + phone3.model + " " + phone3.weight );
        System.out.println();

        Phone phone = new Phone();
        phone.sendMessage("+375291234568", "+375291111111");
    }
}
