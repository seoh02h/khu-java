package chapter7;

public class Q2 {


  public static void main(String[] args) {

    char[] alpha = new char[26];
    char ch = 'A';

    for(int i=0 ; i<alpha.length; i++, ch++){
      alpha[i] = ch;
    }

    for(int i=0; i<alpha.length; i++){
      alpha[i] = (char)( alpha[i] + 32);
      System.out.println(alpha[i]);
    }


  }
}
