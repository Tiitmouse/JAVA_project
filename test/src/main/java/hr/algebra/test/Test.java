package hr.algebra.test;
import hr.algebra.model.Plant;
import java.util.ArrayList;

/**
 *
 * @author lorena
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Plant> bilje = new ArrayList<Plant> (); 
        
        Plant maslacakPlant = new Plant("maslacak", "maslacakus", "korov", "TFM", 
                             "jebem ti maslacke POKOSI TO", "nekipath", 1, "samo beton",0.0, 100000);
        
        Plant tratincicaPlant = new Plant("tratincica", "tratincikus", "cvjetic", "ima", 
                             "aj mi ih spleti", "nekipath2", 2, "relativni amount",0.1, 5000);
        
        Plant djetelinaPlant = new Plant("djetelina", "djetelinus", "lucky tm", "nema", 
                             "nAsAo sAm JeDnU sA cEtIrI lIstA", "nekipath3", 2, "iskremo nez", 2.0, 20);
        
        bilje.add(maslacakPlant);
        bilje.add(tratincicaPlant);
        bilje.add(djetelinaPlant);
        
        bilje.sort((a,b) -> a.getBotanical_name().compareTo(b.getBotanical_name()));
       
        for (Plant plant : bilje) {
            System.out.println(plant); 
        }
        
    }
}