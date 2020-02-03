public class Demo {
    
    public static void square(int n){
        System.out.println(n*n);
    }
    public static void show(Object obj){
        System.out.println(obj);
    }
    
    public static void main(String args[]){
        show("hello");
        show(10);
        show(4.5);
        
        Integer ob=new Integer(5);
        square(ob);
        
        
        
    }
}
