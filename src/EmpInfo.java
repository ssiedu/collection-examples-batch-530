
import java.util.HashMap;


public class EmpInfo {

    public static void main(String[] args) {
        Emp e1 = new Emp("E111", "AAA", "CLERK", 10000);
        Emp e2 = new Emp("E112", "BBB", "ACCOUNTANT", 20000);
        Emp e3 = new Emp("E113", "CCC", "SALESMAN", 30000);
        Emp e4 = new Emp("E114", "DDD", "MANAGER", 40000);
        Emp e5 = new Emp("E115", "EEE", "DIRECTOR", 50000);
        
        HashMap<String,Emp> map=new HashMap<>();
        map.put("E111", e1);
        map.put("E112", e2);
        map.put("E113", e3);
        map.put("E114", e4);
        map.put("E115", e5);
        
        Emp emp=map.get("E117");
        
        System.out.println(emp);
        
    }
}
