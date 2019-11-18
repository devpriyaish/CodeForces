import java.util.Scanner;

public class Elephant
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int steps = n/5;
		if(n%5 != 0)
		    ++steps;
		System.out.println(steps);
	}
}
