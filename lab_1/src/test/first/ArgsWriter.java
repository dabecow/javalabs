package test.first;

public class ArgsWriter {

  public static void main(String[] args) {
    System.out.println("Args:");
    for (String string: args) {
      System.out.println(string);
    }
  }
}
