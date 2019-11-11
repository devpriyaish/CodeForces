import java.util.Scanner;

public class Football
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        int x=0;
        int count = 0;
        for(int i=1; i<word.length(); i++){
            if(word.charAt(i-1)==word.charAt(i)){
                ++count;
                if(count == 6){
                    x = 1;
                    break;
                }
            }
            else    
                count=0;
        }
        if(x==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
