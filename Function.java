import java.util.*;
public class Sum {
  public static int Sum_cal(int a, int b){
  int sum = a+b;
  return sum;
    
}                                                
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();

      int sum=Sum_cal(a,b);
      System.out.println(sum);
    }
} 
        
        
