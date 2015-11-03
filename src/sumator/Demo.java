package sumator;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    try {
      sumString sum = new sumString();
      String a = new String("15");
      String b = new String("20");
      sum.sum(a, b);
    } catch (NullPointerException e) {
      System.out.println("Error");
    }

  }
}