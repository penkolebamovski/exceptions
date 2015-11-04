package sumator;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Sumator {
  public int sum(String a, String b) {
    try {
      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      int sum = x + y;
      return sum;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Invalid input");
    } catch (Exception e) {
      throw new IllegalArgumentException("Exception");
    }
  }
}
