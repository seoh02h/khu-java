package chapter5;

public class PersonTest {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("James");
    person.setAge(40);
    person.setMarried(true);
    person.setNumOfKids(3);
    System.out.println(person.toString());

    Person person2 = new Person("seohyun");
    System.out.println(person2.toString());
  }



}
