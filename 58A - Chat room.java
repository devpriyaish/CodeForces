import java.util.Scanner;

public class Chat
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        String desired_word = "hello";
        int j=0;
        int pass=0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==desired_word.charAt(j)){
                ++j;
                ++pass;
                if(pass == 5)
                    break;
            }
        }
        if(pass == 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
