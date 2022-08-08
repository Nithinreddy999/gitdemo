
import java.util.*;
public class Fifth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int n = sc.nextInt();
        int count=0;
        int i=1;
        while(i<=rows){
            if(rows*i==n || (rows*i)+1==n || n<=rows) {
                count++;
                break;
            }
            i++;
        }
        if(count>0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
