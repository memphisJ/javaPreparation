import java.util.*;

public class SortAnArray{
  public static void main(String...args){
    List<Integer> numbers = new ArrayList<Integer>(){{
      add(20);
      add(40);
      add(10);
      add(80);
      add(50);
      add(90);
      add(30);
      add(70);
      add(60);
      add(90);
      add(100);
    }};
    System.out.println("The numbers in the ArrayList are: " + numbers);

    // Sort the ArrayList
    Collections.sort(numbers);
    System.out.println("The numbers ArrayList sorted are: " + numbers);
  }
}
