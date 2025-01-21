import java.util.*;

public class Main {
  public static void MaxSubArraysum(int number[]){
    int Max=Integer.MIN_VALUE;
    int curr=0;
    
    for(int i=0;i<number.length;i++){
      for(int j=i;j<number.length;j++){
        curr=0;
        for(int k=i;k<=j;k++){
          curr+=number[k];
          }
          System.out.println(curr);
          if(curr>Max){
            Max=curr;
        }
      }
    }
      System.out.println("Maximum subArray sum is : "+Max);
    }
    
    public static void main(String[] args) {
      int number[]={1,-2,6,-1,3};
      MaxSubArraysum(number);
      
  }
}
