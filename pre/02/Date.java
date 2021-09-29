// 2.12 Exercise 2

public class Date {
  public static void main(String[] args){
    String day, month;
    int date, year;

    day = "Sunday";
    month = "September";
    date = 12;
    year = 2021;

    System.out.println("American format:");
    System.out.print(day);
    System.out.print(", ");
    System.out.print(month);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(", ");
    System.out.println(year);

    System.out.println("European format:");
    System.out.print(day);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(" ");
    System.out.print(month);
    System.out.print(" ");
    System.out.println(year);
  }
}
