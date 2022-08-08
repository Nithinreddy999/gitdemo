import java.util.*;
public class First {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int d1=(x-n);
        int d2=(y-n);
        int d3=(z-n);
        if(d1>=0 && d2>=0 && d3>=0) {
            if (d1 <= d2 && d1 <= d3) {
                System.out.println("L1");
            }
            else if (d2 <= d1 && d2 <= d3) {
                System.out.println("L2");
            }
            else if (d3 <= d1 && d3 <= d2) {
                System.out.println("L3");
            }
        }
        else{
            System.out.println("No one");
        }

    }
}
