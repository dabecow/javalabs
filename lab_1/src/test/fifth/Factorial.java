package test.fifth;

public class Factorial {

  public static int F(int n){
    if (n == 1) return 1;
    else return n * F(n-1);
  }

  public static void main(String[] args) {
    int value;

    try {
      value = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("Usage: Factorial [length number]");
      return;
    }

    System.out.println(F(value));
  }
}
