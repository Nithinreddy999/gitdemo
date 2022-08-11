import java.util.HashMap;
import java.util.Map;

public class MangoTypePrice {
    public static void main(String[] args) {
    HashMap<String,Double> mangoData = new HashMap<>();
        mangoData.put("Alphonso",100.0);
        mangoData.put("Banginapalli",150.5);
        mangoData.put("Sindhura",70.5);
        for(Map.Entry<String,Double> iterator : mangoData.entrySet())
        {
            System.out.println("Type: "+iterator.getKey() + "Price "+iterator.getValue());
        }
    }
}
