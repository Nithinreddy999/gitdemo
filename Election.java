import java.util.*;
class NomineeException extends Exception{
    public NomineeException(String message){
        super(message);
    }
}
public class Election {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Nominee: ");
        int age = sc.nextInt();
        try{
            if(age<25){
                throw new NomineeException("Nominee's age is less than 25, not eligible for election participation");
            }
            System.out.println("You are eligible for election participation");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
