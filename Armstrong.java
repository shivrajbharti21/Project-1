import java.util.Scanner;
 
public class Armstrong
{
	public static void main(String[] args)
	{
		int n, count = 0, a, b, c, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amstrong No N: ");
		int no = sc.nextInt();
		System.out.println("Armstrong numbers from 1 to N: ");
		for (int i = 1; i <= no; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				sum = sum + (b * b * b);
				n = n / 10;
			}
			if (sum == i)
			{
				System.out.println(i + " ");
			}
			sum = 0;
		}
	}
}