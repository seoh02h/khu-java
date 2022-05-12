package chapter9.q5_q6;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Car> carList = new ArrayList<Car>();

    carList.add(new Sonata());
    carList.add(new Grandeur());
    carList.add(new Avante());
    carList.add(new Genesis());

    for(Car car : carList) {
      car.run();
      System.out.println("======================");
    }
  }
}
