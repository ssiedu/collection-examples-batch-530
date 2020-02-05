
import java.util.ArrayList;


public class EmpData {
    public static void main(String[] args) {

        ArrayList<Emp> elist=new ArrayList<>();
        elist.add(new Emp("E111","AAA","CLERK",10000));
        elist.add(new Emp("E112","BBB","ACCOUNTANT",20000));
        elist.add(new Emp("E113","CCC","SALESMAN",30000));
        elist.add(new Emp("E114","DDD","MANAGER",40000));
        elist.add(new Emp("E115","EEE","DIRECTOR",50000));

        String code="E115";
        
        for(int i=0; i<elist.size(); i++){
            Emp emp=elist.get(i);
            String id=emp.getEcode();
            
            if(id.equals(code)){
                System.out.println(emp);
            }
            
            
        }
        
        /*
        for(Emp e:elist){
            System.out.println(e);
        }
        */
    }
}
