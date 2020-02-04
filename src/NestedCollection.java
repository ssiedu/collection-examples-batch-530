
import java.util.LinkedList;
import java.util.Stack;

public class NestedCollection {
      public static void main(String[] args) {
        Stud s1=new Stud(111,"AAA","CS",3);
        Stud s2=new Stud(112,"BBB","CS",4);
        Stud s3=new Stud(113,"CCC","IT",5);
        Stud s4=new Stud(114,"DDD","IT",6);
        Stud s5=new Stud(115,"EEE","CS",1);
     
        Stack<Stud> csStk=new Stack<>();
        Stack<Stud> itStk=new Stack<>();
        csStk.push(s1); csStk.push(s2); csStk.push(s5);
        itStk.push(s3); itStk.push(s4);
        
        LinkedList<Stack<Stud>> list=new LinkedList<>();
        list.add(csStk);
        list.add(itStk);
        
        Stack<Stud> stk1=list.get(0);
        Stud e1=stk1.pop();
        e1.show();
        Stud e2=stk1.pop();
        e2.show();
        
        Stack<Stud> stk2=list.get(1);
        Stud e3=stk2.pop();
        e3.show();
        
        
    }
}
