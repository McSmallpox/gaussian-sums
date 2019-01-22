package edu.cnm.deepdive;

public class Gauss
{

  private static final int DEFAULT_UPPER_LIMIT = 100;
  public static void main(String[] args)
  //TODO Read upper limit from args.
  {
  int upLimit = DEFAULT_UPPER_LIMIT;
  long sum = triangleSum(upLimit);
    System.out.printf("Sum from 1 to %,d = %,d%n", upLimit, sum); //%d and %n are placeholders. upLimit and sum fill in those placeholders
    //in their respective orders.
  }
  public static long triangleSum(int upLimit)
  {
    long sum = 0;
    for(int i=1; i <= upLimit; i++)
    {
      sum+=i; //this is the same as writing sum = i + sum.
    }

    return sum;
  }
}