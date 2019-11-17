import java.util.Scanner;

public class HQ9
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String p = reader.next();
		String res = "NO";
		for(int i=0; i<p.length(); i++){
		    char x = p.charAt(i);
		    if(x == 'H' || x == 'Q' || x == '9')
		        res = "YES";
		}
		System.out.println(res);
	}
}
