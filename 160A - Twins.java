import java.util.Scanner;
import java.util.Arrays;

public class Twin
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int sum = 0;
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
		    arr[i] = reader.nextInt();
		    sum += arr[i];
		}
		int count = 0;
		Arrays.sort(arr);
		int disered = 0;
		for(int i=arr.length-1; i>=0; i--){
		    if(disered<=sum/2){
		        ++count;
		    }
		    disered += arr[i];
		}
		System.out.println(count);
	}
}
