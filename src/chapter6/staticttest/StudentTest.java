package chapter6.staticttest;

public class StudentTest {
  public static void main(String[] args) {

    Student studentKim = new Student();
    System.out.println("학번 : " + studentKim.studentID + ", 카드번호 : " + studentKim.cardNumber);

    Student studentLee = new Student();
    System.out.println("학번 : " + studentLee.studentID + ", 카드번호 : " + studentLee.cardNumber);
  }
}
