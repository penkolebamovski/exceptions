package sumator;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SumString {
  public int sum(String a, String b) {
    try {
      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      int sum = x + y;
      return sum;
    } catch (NumberFormatException e) {
      return 101;
    } catch (Exception e) {
      return 200;
    }

  }
}
