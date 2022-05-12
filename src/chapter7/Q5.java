package chapter7;

import java.util.ArrayList;

public class Q5 {
  public static void main(String[] args) {

    ArrayList<Dog> list = new ArrayList<Dog>();
    list.add(new Dog("name1", "type1"));
    list.add(new Dog("name2", "type2"));
    list.add(new Dog("name3", "type3"));
    list.add(new Dog("name4", "type4"));
    list.add(new Dog("name5", "type5"));

    for(int i =0; i<list.size(); i++) {
      System.out.println(list.get(i).showDogInfo());
    }

    for(Dog dog : list) {
      System.out.println(dog.showDogInfo());
    }
  }
}
