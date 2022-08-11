import java.lang.*;
import java.util.*;
class LuggageException extends Exception{
    public LuggageException(String message){
        super(message);
    }
}
class Passengers{
    static String name;
    float luggage_weight;
    String place;
    Passengers(String name,Float luggage_weight,String place){
        this.name=name;
        this.luggage_weight=luggage_weight;
        this.place=place;
    }
    public static void Weight(float luggage_weight){
        try{
            if(luggage_weight > 15){
                throw new LuggageException("Your luggage weight exceeds 15kgs, you have to pay extra amount");
            }
            System.out.println("Your luggage weight is correct");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        finally{
            float temp=luggage_weight - 15;
            System.out.println(name + " Extra amount to be paid: "+ temp*500);
        }
    }
}
public class AirportLuggageCheck {
    public static void main(String[] args) {
        Passengers p1 = new Passengers("Bhavya",18.0f,"Canada");
        Passengers p2 = new Passengers("Sruthi",15.01f,"USA");
        p1.Weight(18.0f);
        p2.Weight(15.01f);
    }
}
