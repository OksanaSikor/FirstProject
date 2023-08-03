package lesson5.practice;

//Создайте класс студента с полями: имя,группа, оценка за диплом
//В цикле создайте массив из 14-ти студентов.
//Создайте конструктор класса студент и используйте его в цикле.
//В конструкторе задайте всем студентам одинаковую группу. И установите
//каждому студенту различную оценку по 10-ти бальной системе с помощью класса Random/
//Создайте метод класса студент, который будет выводить всю информацию о студенте.
//Выведите информацию о всех отличниках (9-10 баллов за диплом) в консоль.

import java.util.concurrent.ThreadLocalRandom;

public class StudensName {
    public static void main(String[] args) {
        String[] names = {"Eugene Stokes",
                "Lois Smith",
                "Laura White",
                "Johnny Rodriguez",
                "Jay Little",
                "Susan Olson",
                "Antonio Hoffman",
                "Richard Parker",
                "Janice Allen",
                "Dolores Bates",
                "Albert Robinson",
                "Grace Cook",
                "Peter Kim",
                "John Ellis",};

        String[] groups = {"group1", "group2", "group3"};
        int studNumber = 14;
        Student[] students = new Student[studNumber];
        for (int i = 0; i < studNumber; i++) {
            students[i] = new Student(
                    names[ThreadLocalRandom.current().nextInt(1, names.length)],
                    groups[ThreadLocalRandom.current().nextInt(1, groups.length)]
            );
        }
        for (int i = 0; i < studNumber; i++) {
            if (students[i].grade > 8) {
                System.out.println(students[i]);
            }
        }
    }
}