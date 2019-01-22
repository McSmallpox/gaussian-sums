package edu.cnm.deepdive;

import java.util.Scanner;

public class Gauss
{

  private static final int DEFAULT_UPPER_LIMIT = 100;
  public static void main(String[] args)
  {
  int upLimit = DEFAULT_UPPER_LIMIT;

    Scanner scanner = new Scanner(System.in); //"Scanner" is the object type, "scanner" is the variable name. "new Scanner" means the new object is
    //being designated as a Scanner object.
    System.out.print("Enter upper limit: ");
    while (scanner.hasNextInt())
    {
      upLimit = scanner.nextInt();
      long sum = triangleSum(upLimit);
      System.out.printf("Sum from 1 to %,d = %,d%n", upLimit, sum); //%d and %n are placeholders. upLimit and sum fill in those placeholders
      //in their respective orders.
      System.out.print("Enter upper limit: ");
    }


  }
  public static long triangleSum(int upLimit)
  {
    long sum = 0;
    for (int i=1; i <= upLimit; i++)
    {
      sum+=i; //this is the same as writing sum = i + sum.
    }

    return sum;
  }
}