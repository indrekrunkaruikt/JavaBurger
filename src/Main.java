import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
	// write your code here

        Map<Burger, Lisandid> menüü = new HashMap<Burger, Lisandid>();
        menüü.put(new Burger("Chicken burger", "valge sai","Kana lihaga",  1.80), new Lisandid(new Lisand("Juust", .20), new Lisand("Salat", 0.10), new Lisand("Tomat", 0.15), new Lisand("Majonees", 0.20)));
        menüü.put(new Burger("Old Fashioned Cheeseburger", "valge sai","loomalihaga",  2.00), new Lisandid(new Lisand("Peekon", .20), new Lisand("Kurk", 0.10), new Lisand("Sibul", 0.15), new Lisand("Peekoni kaste", 0.20)));
        menüü.put(new Burger("New York Burger", "sealiha", 2.00), new Lisandid(new Lisand("Ananass", .20), new Lisand("Tomat", 0.10), new Lisand("Kurk", 0.15), new Lisand("Sibul", 0.20)));

        System.out.println();
        for (Map.Entry<Burger, Lisandid> entry : menüü.entrySet()) {
            System.out.println(entry.getKey().nimi + ":" + entry.getValue().lisa1.nimi);
        }
    }
}
