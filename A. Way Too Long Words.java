import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t-->0)
        {
            String word = reader.next();
            if(word.length()>10)
            {
                System.out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
            }
            else
            {
                System.out.println(word);
            }
        }
	}
}
