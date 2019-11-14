import java.util.Scanner;

public class Soldier
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int k = reader.nextInt();
        int n = reader.nextInt();
        long w = reader.nextInt();
        long sum = k*(w*(w+1)/2);
        if(sum<=n)
            System.out.println(0);
        else
            System.out.println(sum-n);
    }
}
