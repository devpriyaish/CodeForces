import java.util.Scanner;

public class VK
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = reader.nextInt();
        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]>=arr[k-1] && arr[i]>0)
                ++count;
        System.out.println(count);
    }
}
