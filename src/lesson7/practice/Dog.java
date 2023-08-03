package lesson7.practice;

import java.math.BigDecimal;

public class Dog extends Animal{

    private BigDecimal weight;

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
