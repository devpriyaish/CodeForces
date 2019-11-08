import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++)
                matrix[i][j] = reader.nextInt();
        int x=0, y=0;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                if(matrix[i][j] == 1){
                    x = i;
                    y = j;
                }
            }
        }
        int a = Math.abs(2-x);
        int b = Math.abs(2-y);
        System.out.println(a+b);
    }
}
