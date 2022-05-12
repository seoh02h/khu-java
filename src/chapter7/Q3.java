package chapter7;

public class Q3 {
  public static void main(String[] args) {

    int[] number = new int[5];
    int total = 0;

    for(int i=1; i<=5; i++){
      number[i-1] = i*2;
      total += number[i-1];
    }

    System.out.println(total);
  }
}
