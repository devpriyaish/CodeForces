import java.util.Scanner;

public class WaterMelon
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		if(num%2 != 0 || num<=2)
			System.out.println(“No”);
		else
			System.out.println(“Yes”);
	}
}
