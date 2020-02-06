
import java.util.Arrays;


public class ArraysExample {
    public static void main(String[] args) {

        String cities[]={"indore","delhi","bhopal","pune","mumbai","chennai"};
        for(String city:cities){
            System.out.println(city);
        }
        Arrays.sort(cities);
        System.out.println("After Sorting.....................");
        for(String city:cities){
            System.out.println(city);
        }
        
        int idx=Arrays.binarySearch(cities,"mumbai");
        System.out.println("Index of mumbai : "+idx);
        
        
    }
}
