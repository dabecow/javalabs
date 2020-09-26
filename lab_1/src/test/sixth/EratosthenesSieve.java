package test.sixth;

import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesSieve {

  public static ArrayList<Integer> getSieve(int length){
    boolean[] array = new boolean[length];

    Arrays.fill(array, true);

    for (int i = 2; i < length; i++) {
      for (int j = i*i; j < length; j+=i) {
        array[j-1] = false;
      }
    }

    ArrayList<Integer> sieve = new ArrayList<>();

    for (int i = 1; i < length; i++) {
      if (array[i-1]) sieve.add(i);
    }

    return sieve;
  }

  public static void main(String[] args) {
    int value;

    try {
      value = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("Usage: EratosthenesSieve [length number]");
      return;
    }

    System.out.println(getSieve(value));
  }
}
