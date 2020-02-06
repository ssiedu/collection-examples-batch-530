
import java.util.ArrayList;
import java.util.Collections;


public class CollectionsExample {

    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("delhi"); cities.add("mumbai");
        cities.add("chennai"); cities.add("bhopal");
        cities.add("pune");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);
        
        
    }
}
