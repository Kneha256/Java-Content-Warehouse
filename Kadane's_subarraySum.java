import java.util.*;

public class Main {
  public static void kadanes(int number[]){
    int current=0;
    int Max=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
      current+=number[i];
      if(current<0){
        current=0;
      }
      Max=Math.max(current,Max);
    }
    System.out.println(Max);
    
  }
    public static void main(String[] args) {
      int number[]={1,-2,6,-1,3};
      kadanes(number);
  }
}
