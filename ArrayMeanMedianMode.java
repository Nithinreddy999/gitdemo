import java.util.*;
public class ArrayMeanMedianMode {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        int mean,median,mode=0;
        System.out.println("Mean is: "+ sum/n);

        if(n%2!=0)
            median = a[n/2];
        else
            median = (a[(n/2)-1]+a[n/2])/2;
        System.out.println("Median is: "+ median);

        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==a[i])
                    count++;
            }
            if(count>maxcount)
            {
                maxcount=count;
                mode = a[i];
            }
        }
        System.out.println("Mode is: " + mode);
    }
}
