package chapter5;

public class Person {

  private int age;

  private String name;

  private boolean isMarried;

  private int numOfKids;

  public Person() {}

  public Person(String pname) {
    name = pname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isMarried() {
    return isMarried;
  }

  public void setMarried(boolean married) {
    isMarried = married;
  }

  public int getNumOfKids() {
    return numOfKids;
  }

  public void setNumOfKids(int numOfKids) {
    this.numOfKids = numOfKids;
  }

  @Override
  public String toString() {
    return
        "나이 : " + age + '\n' +
        "이름 : " + name + '\n' +
        "결혼 여부 : " + isMarried +'\n' +
        "자녀 수 : " + numOfKids;}
}
