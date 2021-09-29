// 2.12 Exercise 3

public class Time{
  public static void main(String[] args){
    int hour, minute, second;

    hour = 16;
    minute = 3;
    second = 40;

    System.out.print("Number of seconds since midnight: ");
    System.out.println(hour * 3600 + minute * 60 + second);

    System.out.print("Number of seconds remaining in the day: ");
    System.out.println((24 - hour) * 3600 - minute * 60 - second);

    System.out.print("Percentage of the day that has passed: ");
    System.out.print((hour * 3600 + minute * 60 + second)* 100 / (24 * 3600));
    System.out.println("%");

    int hour1, minute1, second1, elapsed;

    hour1 = 16;
    minute1 = 22;
    second1 = 36;
    elapsed = (hour1 - hour) * 3600 + (minute1 - minute) * 60 + second1 - second;

    System.out.print("Elapsed time: ");
    System.out.print(elapsed);
    System.out.print(" seconds");
  }
}
