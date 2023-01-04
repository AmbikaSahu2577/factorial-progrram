import java.util.Scanner;
class Factorial_Example
{
	public static void main(String[] args) 
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
	}

	static int fact(int n)
	{
      int fact = 1;
      for (int i = 1;i<= n;i++ ) 
      {
      	fact = fact*i;
      }
      return fact;
	}
}