package Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo2"); // giống key dùng put là thay thế , nếu !=key là thêm mới luôn, nếu duplitcate là thêm1 thôi
        capitalCities.put("USA", "Washington DC");

        System.out.println("Current cities " + capitalCities);
        for (String x : capitalCities.keySet()) {
            System.out.println("key là " + x + "  Value là " + capitalCities.get(x));
        }
    }
}
