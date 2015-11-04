package sumator;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Sumator sum = new Sumator();
    try {
      String a = "avc";
      String b = "20";
      System.out.println(sum.sum(a, b));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } catch (NullPointerException ex) {
      System.out.println("The argument is null");
    }
  }
}
