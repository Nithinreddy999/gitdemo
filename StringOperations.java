import java.util.*;
public class StringOperations {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("Length of String s1 is: "+ s1.length());
        System.out.println("Length of String s2 is: "+ s2.length());
        String merge=s1+s2;
        System.out.println("Merging strings: " + merge);
        System.out.println("Splitting s2: "+ merge.substring(s1.length(),merge.length()));
        if(s1.equals(s2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        System.out.println("Reverse of s1 is: "+sb);
    }
}
