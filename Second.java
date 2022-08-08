import java.util.*;
public class Second {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Mon,Tue,Wed,Thr,Fri,Sat,Sun;
        int Bonus,Brate;
        int a[]=new int[7];
        for(int i=1;i<=7;i++)
        {
            a[i]=sc.nextInt();
        }
        Sun = a[1]*150;
        Sat = a[7]*125;
        if(a[2]<=8)
        {
            Mon = a[2]*8;
        }
        else if(a[2]>8)
        {
            Bonus = a[2]-8;
            Brate = Bonus * 115;
            Mon = Brate + 800;
        }

        if(a[3]<=8)
        {
            Tue = a[2]*8;
        }
        else if(a[3]>8)
        {
            Bonus = a[3]-8;
            Brate = Bonus * 115;
            Tue = Brate + 800;
        }

        if(a[4]<=8)
        {
            Wed = a[4]*8;
        }
        else if(a[4]>8)
        {
            Bonus = a[4]-8;
            Brate = Bonus * 115;
            Wed = Brate + 800;
        }

        if(a[5]<=8)
        {
            Thr = a[5]*8;
        }
        else if(a[5]>8)
        {
            Bonus = a[5]-8;
            Brate = Bonus * 115;
            Thr = Brate + 800;
        }

        if(a[6]<=8)
        {
            Fri = a[6]*8;
        }
        else if(a[6]>8)
        {
            Bonus = a[6]-8;
            Brate = Bonus * 115;
            Fri = Brate + 800;
        }

        int total,extradays,extrarate,totalsalary;
        total = a[2]+a[3]+a[4]+a[5]+a[6];
        if(total>40)
        {
            extradays = total-40;
            extrarate = extradays*25;
        }
        totalsalary = Sun+Mon+Tue+Wed+Thr+Fri+Sat+extrarate;
        System.out.println(totalsalary);
    }
}
