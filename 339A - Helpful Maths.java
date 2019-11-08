import java.util.Scanner;
import java.util.Arrays;

public class Math
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String exp = reader.next();
        char[] ch = new char[exp.length()/2+1];
        int x=0;
        for(int i=0; i<exp.length(); i+=2)
        {
            ch[x] = exp.charAt(i);
            x++;
        }
        Arrays.sort(ch);
        int p=0;
        char[] fin = new char[exp.length()];
        for(int i=0; i<exp.length(); i++)
        {
            if(i%2==0)
            {
                fin[i] = ch[p];
                p++;
            }
            else
                fin[i] = '+';
        }
        for(int i=0; i<fin.length; i++)
        {
            System.out.print(fin[i]);
        }
    }
}
