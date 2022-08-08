import java.util.*;
public class Third {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if(i>=j)
                    System.out.print("1");
                else
                    System.out.print("2");
            }
            System.out.print("\n");
        }
    }
}
