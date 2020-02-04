public class Stud {
    private int rno;
    private String name;
    private String branch;
    private int sem;
    
    public Stud(int a, String b, String c, int d){
        rno=a; name=b; branch=c; sem=d;
    }
    public void show(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
}
