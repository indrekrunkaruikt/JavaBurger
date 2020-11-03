import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Kassa {
    Map<Burger,Lisandid> menüü;
    Burger valitudBurger = null;
    Double burgeriHind = null;
    Lisandid valitudBurgeriLisandid = null;
    
    public Kassa(Map<Burger,Lisandid> menüü) {
        this.menüü = menüü;
    }
    public void PrindiMenüü(){
        for (Map.Entry<Burger, Lisandid> entry : menüü.entrySet()) {
            System.out.println(entry.getKey().nimi + " | " + entry.getKey().hind + " | " + entry.getKey().liha + " | " +entry.getKey().sai);
        }
        System.out.println("-----------------------------------------------------");
    }
    public Double tagastaBurgerIhind(){
        return this.burgeriHind;
    }
    public void KüsiMillistBurgeritKlietnSoovib(){

        while(true){
            System.out.print("Vali oma burger: ");
            Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
            String valitudBurgeriNimi= sc.nextLine();   //reads string before the space
            for (Map.Entry<Burger, Lisandid> entry : menüü.entrySet()) {
                if(entry.getKey().nimi.matches(valitudBurgeriNimi)){
                    this.valitudBurger = entry.getKey();
                    this.burgeriHind = entry.getKey().hind;
                    this.valitudBurgeriLisandid = entry.getValue();
                }
            }
            if(this.valitudBurger != null && this.valitudBurgeriLisandid != null){
                this.valitudBurger.printBurger();
                break;
            }else{
                System.out.println("Kuskil on kirjaviga");
            }
        }
        System.out.println("-----------------------------------------------------");
    }
    public void küsiMisLisandeidKlientSoovib(){
        System.out.print("Vali oma lisandid: ");
        if(valitudBurgeriLisandid.klientValibLisandid(this.valitudBurgeriLisandid.lisa1)){
            this.burgeriHind = this.burgeriHind + this.valitudBurgeriLisandid.lisa1.hind;
        };
        if(valitudBurgeriLisandid.klientValibLisandid(this.valitudBurgeriLisandid.lisa2)){
            burgeriHind = burgeriHind + this.valitudBurgeriLisandid.lisa1.hind;
        }
        if(valitudBurgeriLisandid.klientValibLisandid(valitudBurgeriLisandid.lisa3)){
            burgeriHind = burgeriHind + valitudBurgeriLisandid.lisa1.hind;
        }
        if(valitudBurgeriLisandid.klientValibLisandid(valitudBurgeriLisandid.lisa4)){
            burgeriHind = burgeriHind + valitudBurgeriLisandid.lisa1.hind;
        }
        System.out.println(burgeriHind);
        System.out.println("-----------------------------------------------------");
    }
}
