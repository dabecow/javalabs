package test.fourth;

public class Fibonacci {

  public static int F(int n){
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;
    else
      return F(n-1) + F(n-2);
  }

  public static void main(String[] args) {
   int length;

   try {
      length = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("Usage: Fibonacci [length number]");
      return;
    }

    for (int i = 0; i < length; i++) {
      System.out.print(F(i) + " ");
    }

  }
}
