package lesson7.practice;

public class Cat extends Animal {

     private String eyesColor;


     @Override
     public void voice() {
          System.out.println(getName() + "Мяу");
     }

     public String getEyesColor() {
          return eyesColor;
     }

     public void setEyesColor(String eyesColor) {
          this.eyesColor = eyesColor;
     }
}

