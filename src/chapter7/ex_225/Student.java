package chapter7.ex_225;

public class Student {
  int studentID;
  String name;

  public Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
  }

  public void showStudentInfo() {
    System.out.println( studentID + "," + name);
  }
}
