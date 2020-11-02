import java.util.HashMap;
import java.util.Map;

public class Burger {
    String nimi, sai, liha;
    Double hind;
    Lisandid lisandid;
    public Burger(String nimi, String sai, String liha, double hind) {
        this.nimi = nimi;
        this.sai = sai;
        this.liha = liha;
        this.hind = hind;
    }
    public Burger(String nimi, String liha, double hind) {
        this.nimi = nimi;
        this.sai = "Teravilja sai";
        this.liha = liha;
        this.hind = hind;

    }

    public void printBurger(){
        System.out.println("Burger: " + this.nimi + " | "+ this.sai + " | "+ this.liha + " | "+ this.hind);
        //lisandid.printLisandid();
    }
}
