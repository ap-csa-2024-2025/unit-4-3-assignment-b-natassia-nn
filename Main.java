import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(isPrime(12));
  }

  public static boolean isPrime(int N)
  {
    if (N == 1)
    {
      return false;
    }
    for (int d = 2; d < 10; d++)
    {
      if (N % d == 0)
      {
        return false;
      }
    }
    return true;
  }
}
