package chapter7;

public class Q4 {
  public static void main(String[] args) {

    Dog[] dogArray = new Dog[5];
    dogArray[0] = new Dog("name1", "type1");
    dogArray[1] = new Dog("name2", "type2");
    dogArray[2] = new Dog("name3", "type3");
    dogArray[3] = new Dog("name4", "type4");
    dogArray[4] = new Dog("name5", "type5");

    for(int i =0; i<dogArray.length; i++) {
      System.out.println(dogArray[i].showDogInfo());
    }

    for(Dog dog : dogArray) {
      System.out.println(dog.showDogInfo());
    }
  }
}
