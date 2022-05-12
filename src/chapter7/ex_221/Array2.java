package chapter7.ex_221;

public class Array2 {
  public static void main(String[] args) {

    char[][] alpha = new char[13][2];
    char ch = 'a';

    for(int i=0; i<alpha.length; i++) {
      for(int j=0; j<alpha[i].length; j++) {
        alpha[i][j] = ch;
        System.out.print(alpha[i][j] + " ");
        ch++;
      }
      System.out.println();
    }
  }
}
