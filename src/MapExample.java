
import java.util.HashMap;


public class MapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1001, "CS");
        map.put(1002, "IT");
        map.put(1003, "Civil");
        map.put(1004, "Mech");
        String branch=map.get(1001);
        System.out.println(branch);
        
        
    }
}
