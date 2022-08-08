import java.util.*;
public class Second {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Mon=0;
                int Tue = 0;
                int Wed=0;
                int Thr=0;
                int Fri=0;
                int Sat=0;
                int Sun=0;
        int Bonus,Brate;
        int a[]=new int[7];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Sun = a[0]*150;
        Sat = a[6]*125;
        if(a[1]<=8)
        {
            Mon = a[1]*8;
        }
        else if(a[1]>8)
        {
            Bonus = a[1]-8;
            Brate = Bonus * 115;
            Mon = Brate + 800;
        }

        if(a[2]<=8)
        {
            Tue = a[2]*8;
        }
        else if(a[2]>8)
        {
            Bonus = a[2]-8;
            Brate = Bonus * 115;
            Tue = Brate + 800;
        }

        if(a[3]<=8)
        {
            Wed = a[3]*8;
        }
        else if(a[3]>8)
        {
            Bonus = a[3]-8;
            Brate = Bonus * 115;
            Wed = Brate + 800;
        }

        if(a[4]<=8)
        {
            Thr = a[4]*8;
        }
        else if(a[4]>8)
        {
            Bonus = a[4]-8;
            Brate = Bonus * 115;
            Thr = Brate + 800;
        }

        if(a[5]<=8)
        {
            Fri = a[5]*8;
        }
        else if(a[5]>8)
        {
            Bonus = a[5]-8;
            Brate = Bonus * 115;
            Fri = Brate + 800;
        }

        int total=0;
        int extradays=0;
        int extrarate=0;
        int totalsalary=0;
        total = a[1]+a[2]+a[3]+a[4]+a[5]
        ;
        if(total>40)
        {
            extradays = total-40;
            extrarate = extradays*25;
        }
        totalsalary = Sun+Mon+Tue+Wed+Thr+Fri+Sat+extrarate;
        System.out.println(totalsalary);
    }
}
