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

        HashMap<String,Double> mangoPrice = new HashMap<>();
        mangoPrice.put("Alphonso",2.5);
        mangoPrice.put("Banginapalli",4.0);
        mangoPrice.put("Sindhura",1.5);
        for(String iterator : mangoPrice.keySet()){
            double price;
            price=mangoData.get(iterator)*mangoPrice.get(iterator);
            System.out.println("Price of "+iterator+" is "+price);
        }
        }
    }

