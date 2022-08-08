import java.util.*;
public class ProStatement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int l3=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        if(n<l1)
        {
            c+=1;
            if(c==1)
            {
                System.out.println(l1);
            }
        }
        if(n<l2)
        {
            c+=1;
        }


    }
}
