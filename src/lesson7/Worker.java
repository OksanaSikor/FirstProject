package lesson7;

public class Worker implements JobTitle{
    String name;
    String position = "Worker";

    public Worker (String name) {
        this.name = name;
    }

    @Override
    public void printPositions() {
        System.out.println("Employee " + name + " is: " + position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
