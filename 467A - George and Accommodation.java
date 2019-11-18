import java.util.Scanner;

public class George
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for(int i=0; i<n; i++){
		    p[i] = reader.nextInt();
		    q[i] = reader.nextInt();
		}
		int count = 0;
		for(int i=0; i<n; i++)
		    if(q[i]-p[i]>=2)
		        ++count;
		System.out.println(count);
	}
}
