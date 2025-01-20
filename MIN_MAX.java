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
