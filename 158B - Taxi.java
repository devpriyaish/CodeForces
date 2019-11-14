import java.util.Scanner;

public class Taxi
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] s = new int[n];
        for(int i=0; i<s.length; i++)
            s[i] = reader.nextInt();
        int count = 0;
        int[] group = new int[4];
        for(int i=0; i<s.length; i++){
            if(s[i] == 4)
                ++group[0];
            else if(s[i] == 3)
                ++group[1];
            else if(s[i] == 2)
                ++group[2];
            else
                ++group[3];
        }
        count += group[0];
        count += group[1];
        if(group[1]>group[3])
            group[3] = 0;
        else
            group[3] -= group[1];
        count += group[2]/2;
        group[2] %= 2;
        if(group[2] == 0){
            count += group[3]/4;
            group[3] %= 4;
            if(group[3] != 0)
                ++count;
        }
        else{
            count += group[3]/4;
            group[3] %= 4;
            if(group[3] <3)
                ++count;
            else
                count += 2;
        }
        System.out.println(count);
    }
}
