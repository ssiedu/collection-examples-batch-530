import java.util.Stack;


public class WCExample {
    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("abc");
        stk.push(10);
        stk.push(2.5);
        //stk.push(new Integer(10));
        //stk.push(new Double(3.5));

        Double d1=(Double)stk.pop();
        //unboxing a premitive double from double object
        //double d2=d1.doubleValue();
        //System.out.println(d2*2);
        
        //manual unboxing
        System.out.println(d1.doubleValue()*2);
        //auto unboxing
        System.out.println(d1*2);
        
        
    }
}
