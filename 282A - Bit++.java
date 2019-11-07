import java.util.Scanner;

public class Bit
{
	public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x=0;
        while(n-->0)
        {
            char symbol = reader.next().charAt(1);
            if(symbol == '+')
                x++;
            else
                --x;
        }
        System.out.println(x);
    }
}

