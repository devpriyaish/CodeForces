import java.util.Scanner;

public class Lucky
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        String res = "NO";
        int[] arr = {4,7,44,47,74,77,444,447,477,777,774,744};
        for(int i=0; i<arr.length; i++){
            if(num%arr[i]==0)
                res = "YES";
        }
        System.out.println(res);
    }
}
