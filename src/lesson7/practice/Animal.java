package lesson7.practice;

import java.util.Calendar;

public abstract class Animal {
     private Integer animal_id;
     private String name;
     private Calendar birthday;

     public abstract void voice();

     public Integer getAnimal_id() {
          return animal_id;
     }

     public void setAnimal_id(Integer animal_id) {
          this.animal_id = animal_id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Calendar getBirthday() {
          return birthday;
     }

     public void setBirthday(Calendar birthday) {
          this.birthday = birthday;
     }
}
