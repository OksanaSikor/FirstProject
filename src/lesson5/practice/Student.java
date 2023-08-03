package lesson5.practice;

import java.util.concurrent.ThreadLocalRandom;

public class Student {

    String name;
    String group;
    int grade;

    Student(String name, String group) {
        this.name = name;
        this.group = group;
        this.grade = ThreadLocalRandom.current().nextInt(1, 11);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                '}';
    }
}

