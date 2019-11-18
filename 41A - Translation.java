import java.util.Scanner;

public class Translation
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String n = reader.next();
		String p = reader.next();
		String rev = "";
		for(int i=n.length()-1; i>=0; i--){
		    rev += n.charAt(i);
		}
		if(p.equals(rev))
		    System.out.println("YES");
		else
		    System.out.println("NO");
	}
}
