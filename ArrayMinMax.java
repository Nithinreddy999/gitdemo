import java.util.*;
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Minimum Marks:"+a[0]);
        System.out.print("Maximum Marks:"+a[n-1]);
    }
}

