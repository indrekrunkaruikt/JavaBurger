import java.util.Map;
import java.util.Scanner;

public class Lisandid {
    Lisand lisa1, lisa2, lisa3, lisa4;


    public Lisandid(Lisand lisa1, Lisand lisa2, Lisand lisa3, Lisand lisa4){
        this.lisa1 = lisa1;
        this.lisa2 = lisa2;
        this.lisa3 = lisa3;
        this.lisa4 = lisa4;
    }

    public boolean klientValibLisandid(Lisand lisa){
        double lisanditeHind;
        System.out.println("Kas sa soovid: " + lisa.getLisaNimi() + " "+ lisa.getLisaHind());
        System.out.print("Kirjuta 'jah' kui soovid: ");
        Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
        String vastus= sc.nextLine();   //reads string before the space
        System.out.println("You have entered: " + vastus);
        if(vastus == "jah"){
            System.out.println(lisa.getLisaNimi() + "on lisatud.");
            return true;
        }
        return false;
    }


}
