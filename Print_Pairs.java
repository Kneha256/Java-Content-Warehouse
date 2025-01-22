import java.util.*;

public class Main {
  public static void printpairs(int number[]){
    for(int i=0;i<number.length;i++){
      for(int j=i+1;j<number.length;j++){
        System.out.print("("+number[i]+","+number[j]+")");
      }
      System.out.println();
    }
    
  }
    public static void main(String[] args) {
      int number[]={2,9,5,3,1,7};
      printpairs(number);
  }
}
