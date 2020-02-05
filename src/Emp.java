public class Emp {
    private String ecode;
    private String ename;
    private String desg;
    private int sal;

    public String getEcode() {
        return ecode;
    }

    
    
    
    @Override
    public String toString() {
        return "Emp{" + "ecode=" + ecode + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + '}';
    }

    
    
    public Emp(String ecode, String ename, String desg, int sal) {
        this.ecode = ecode;
        this.ename = ename;
        this.desg = desg;
        this.sal = sal;
    }
    
    
}
