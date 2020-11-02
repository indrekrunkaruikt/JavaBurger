import java.util.Map;
import java.util.HashMap;

public class Köök {

    private Map<Burger, Lisandid> BurgerLisanditega;
    public Köök(Map<Burger, Lisandid> BurgerLisanditega) {
        this.BurgerLisanditega = BurgerLisanditega;
        this.BurgerLisanditega = new HashMap<Burger, Lisandid>();
       // this.BurgerLisanditega.put(new Burger("saast"), new Lisandid( new Lisand("Juust", .20), new Lisand("Salat", 0.10), new Lisand("Tomat", 0.15), new Lisand("Majonees", 0.20)));
       // this.BurgerLisanditega.put(Burger, new Lisandid(new Lisand("Peekon", .20), new Lisand("Kurk", 0.10), new Lisand("Sibul", 0.15), new Lisand("Peekoni kaste", 0.20)));
    }

}
