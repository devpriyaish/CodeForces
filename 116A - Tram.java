import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int stations = reader.nextInt();
        int[] a = new int[stations];
        int[] b = new int[stations];
        for(int i=0; i<stations; i++){
            a[i] = reader.nextInt();
            b[i] = reader.nextInt();
        }
        int max = 0;
        int sum = 0;
        for(int i=0; i<stations; i++){
            sum -= a[i];
            sum += b[i];
            if(max<sum)
                max = sum;
        }
        System.out.println(max);
    }
}
