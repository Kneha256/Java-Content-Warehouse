//Average of 3 num
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
        


//isEven or Odd
import java.util.*;
public class javaBasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n; 
        
        System.out.println("enter a number");
        n=sc.nextInt();
        
        if(isEven(n)){
        System.out.println("It is an even number");
        }
        else{
        System.out.println("n is not an even number");
        }
}
        
        
    public static boolean isEven(int num){
    if(num%2==0){
        return true;
    }
    else{
        return false;
    }
}
    
}
