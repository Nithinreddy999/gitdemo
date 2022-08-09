class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public static boolean inSameMonth(Holiday h1,Holiday h2){
        return h1.month.equals(h2.month);
    }

    public static double avgDate(Holiday[] holiday_array){
        int sol=0;
        for(int i=0;i<holiday_array.length;i++){
            sol+=holiday_array[i].day;
        }
        return ((double)sol)/holiday_array.length;
    }
}

public class HolidayProgram {
    public static void main(String[] args) {
        Holiday h1=new Holiday("Independance Day",4,"July");
        Holiday h2=new Holiday("Republic Day",4,"July");
        System.out.println(Holiday.inSameMonth(h1,h2));
        Holiday [] holiday_array=new Holiday[2];
        holiday_array[0]=h1;
        holiday_array[1]=h2;
        System.out.println(Holiday.avgDate(holiday_array));

    }
}
