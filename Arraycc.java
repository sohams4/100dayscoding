import java.util.*;
public class Arraycc {
  public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
     for(int i=0; i<numbers.length; i++ ){ 
        if(largest < numbers[i]){
            largest = numbers[i];

        }
    }
    return largest;
   }
    public static void main(String[] args) {
        int numbers[] = {41, 62, 86, 23, 35} ;
      System.out.println("Largest value is "+ getLargest(numbers) );
      }
}
