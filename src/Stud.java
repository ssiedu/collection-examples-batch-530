
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Stud{" + "rno=" + rno + ", name=" + name + ", branch=" + branch + ", sem=" + sem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stud other = (Stud) obj;
        if (this.rno != other.rno) {
            return false;
        }
        if (this.sem != other.sem) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.branch, other.branch)) {
            return false;
        }
        return true;
    }
    
}
