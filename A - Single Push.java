import java.util.Scanner;

public class Single
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0){
		    int n = reader.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = reader.nextInt();
		    for(int i=0; i<n; i++)
		        b[i] = reader.nextInt();
		    String res = "";
		    int k=0;
		    int l=0;
		    int r=0;
		    for(int i=0; i<n; i++){
		        if(a[i]>b[i]){
		            res = "NO";
		            break;
		        }
		        else if(a[i]==b[i])
		            res = "YES";
		        else{
		            if(k!=0){
    		            if(b[i] - a[i] == k){
    		                if(i == r+1){
    		                    r = i;
    		                }
    		                else{
    		                    res = "NO";
    		                    break;
    		                }
    		            }
    		            else{
    		                res = "NO";
    		                break;
    		            }
		            }
		            else{
    		            k = b[i] - a[i];
    		            l = i;
    		            r = i;
    		            res = "YES";
		            }
		        }
		    }
		    System.out.println(res);
		}
	}
}
