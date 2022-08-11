import java.util.*;
public class ExtractNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] a = new String[n];
        System.out.println("Please enter names ");
        for (int i = 0; i < n;i++){
            a[i] = sc.nextLine();
        }
        System.out.println(a[0]);
    }
}
