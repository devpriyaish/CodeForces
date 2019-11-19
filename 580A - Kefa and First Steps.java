import java.util.Scanner;

public class Kefa
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		    arr[i] = reader.nextInt();
		int max = 1;
		int count = 1;
		for(int i=1; i<arr.length; i++){
		    if(arr[i-1]<=arr[i]){
		        ++count;
    		    if(count>max)
    		        max = count;
		    }
		    else
		        count = 1;
		}
		System.out.println(max);
	}
}
