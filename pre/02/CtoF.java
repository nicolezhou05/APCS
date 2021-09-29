// 3.12 Exercise 2

import java.util.Scanner;

public class CtoF{
  public static void main(String[] args){
    double celsius, fahrenheit;
    Scanner in = new Scanner(System.in);

    System.out.print("Temperature in Celsius: ");
    celsius = in.nextDouble();

    fahrenheit = celsius * (9.0 / 5.0) + 32;
    System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
  }
}
