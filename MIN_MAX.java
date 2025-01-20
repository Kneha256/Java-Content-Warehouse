//to find minimum value
import java.util.*;

public class Main {
    public static int getMinimum(int numbers[]){
      int Minimum=Integer.MAX_VALUE;
      for(int i=0;i<numbers.length;i++){
        if(numbers[i]<Minimum){
          Minimum=numbers[i];
        }
      }
      return Minimum;
    }
    public static void main(String[] args) {
     int numbers[]={8,2,4,5,3,6,7,9};
     System.out.println("Minimum value is : " + getMinimum(numbers));
  }
}

//To find Max value in the given array
import java.util.*;

public class Hello {
    public static int getvalue(int numbers[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        if(numbers[i]>largest){
          largest=numbers[i];
        }
      }
      return largest;
    }
    
    public static void main(String[] args) {
      int numbers[]={2,3,4,9,5,8};
      System.out.println("largest number is : "+getvalue(numbers));
      
  }
}
