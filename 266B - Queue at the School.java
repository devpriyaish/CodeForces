import java.util.Scanner;

public class Queue
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int t = reader.nextInt();
		String s = reader.next();
		char[] ch = s.toCharArray();
		for(int i=0; i<t; i++){
		    for(int j=1; j<n; j++){
		        if(ch[j-1] == 'B' && ch[j] == 'G'){
		            char temp = ch[j-1];
		            ch[j-1] = ch[j];
		            ch[j] = temp;
		            j++;
		        }
		    }
		}
		for(int i=0; i<n; i++)
		    System.out.print(ch[i]);
		
	}
}
