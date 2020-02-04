
import java.util.Stack;


public class StudentList {
    public static void main(String[] args) {
        Stud s1=new Stud(111,"AAA","CS",3);
        Stud s2=new Stud(112,"BBB","CS",4);
        Stud s3=new Stud(113,"CCC","IT",5);
        Stud s4=new Stud(114,"DDD","IT",6);
        Stud s5=new Stud(115,"EEE","CS",1);
        
        Stack<Stud> stk=new Stack<>();
        stk.push(s1);
        stk.push(s2);
        stk.push(s3);
        stk.push(s4);
        stk.push(s5);
        
        Stud s=stk.pop();
        s.show();
        
        /*
        LinkedList<Stud> list=new LinkedList<>();
        list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
        
        for(Stud st:list){
                st.show();
        }
        */
        
    }
}
