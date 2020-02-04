
import java.util.Stack;


public class GStack {
    public static void main(String[] args) {
        
        Stack<String> stk1=new Stack<String>();
        stk1.push("indore");
        stk1.push("bhopal");
        String r1=stk1.pop();
        System.out.println(r1);
        
        Stack<Integer> stk2=new Stack<>();
        stk2.push(10);
        stk2.push(20);
        int r2=stk2.pop();
        System.out.println(r2);
        
        
        //Stack<Object> stk3=new Stack<>();
        Stack stk3=new Stack();
        stk3.push("ab");
        stk3.push(15);
        stk3.push(34.45);
        Double r3=(Double)stk3.pop();
        System.out.println(r3);
        
        
        
    }
}
