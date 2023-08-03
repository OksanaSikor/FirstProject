package lesson7.practice;

public class Tiger extends Cat{

    private Integer countEatenExployees;

    @Override
    public void voice() {
        super.voice();
        System.out.println( "Ррр");
    }

    public Integer getCountEatenExployees() {
        return countEatenExployees;
    }

    public void setCountEatenExployees(Integer countEatenExployees) {
        this.countEatenExployees = countEatenExployees;
    }
}
