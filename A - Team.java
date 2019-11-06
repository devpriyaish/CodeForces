import java.util.Scanner;

public class Round
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        int count = 0;
        while(t-->0)
        {
            int petya = reader.nextInt();
            int vasya = reader.nextInt();
            int tonya = reader.nextInt();
            if(petya+vasya+tonya >=2)
                ++count;
        }
        System.out.println(count);
    }
}
