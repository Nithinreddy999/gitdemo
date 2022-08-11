import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Marks = new ArrayList<>();
        int subjects=sc.nextInt();
        int total=0;
        for(int position=0;position<subjects;position++){
            Marks.add(sc.nextInt());
            total=total+Marks.get(position);
        }
        System.out.println(Marks.size());
        System.out.println("Marks Of All Subjects:"+Marks);
        System.out.println("Total Marks:"+total);
        float percentage = (float)(total/(Marks.size()));
        System.out.println("Percentage: "+percentage);

        //Second Iteration
        System.out.println("Select an element to remove");
        int pos=sc.nextInt();
        try{
            Marks.remove(pos);
            total=total-Marks.get(pos);
        }
        catch(Exception exception){
            System.out.println("Please give the valid position / give the position less than a Array Size");
        }
        System.out.println(Marks.size());
        System.out.println("Marks Of All Subjects:"+Marks);
        System.out.println("Total Marks:"+total);
        percentage = (float)(total/(Marks.size()));
        System.out.println("Percentage: "+percentage);
        System.out.println("Percentage after removing an element: "+ (total/(Marks.size())));
    }
}
