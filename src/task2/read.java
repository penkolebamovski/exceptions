package task2;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class read {
  public void readConsole() throws OutsideOfIntervalException {
    try {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter number:");
      int number =scanner.nextInt();
      if (number > 0 && number < 100) {
        System.out.println(number);
      } else {
        throw new OutsideOfIntervalException("This element is outside interval");
      }
    } catch (OutsideOfIntervalException ex) {
      System.out.println(ex);

    }
  }
}
