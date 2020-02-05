
import java.util.HashSet;


public class StudentData {

    public static void main(String[] args) {

        Stud s1=new Stud(111, "AAA", "CS", 3);
        Stud s2=new Stud(112, "BBB", "IT", 4);
        Stud s3=new Stud(111, "AAA", "CS", 3);
        HashSet<Stud> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
