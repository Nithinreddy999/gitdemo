import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String,Double> studentData = new HashMap<>();
        studentData.put("Maths",95.0);
        studentData.put("Science",87.1);
        studentData.put("Social",72.8);
        for(Map.Entry<String,Double> iterator : studentData.entrySet())
        {
            System.out.println("subject: "+iterator.getKey() + "Marks "+iterator.getValue());
        }
        for(String iterator : studentData.keySet()){
            System.out.println("Marks " + studentData.get(iterator));
        }
    }
}
