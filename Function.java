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


import java.util.*;
public class HelloWorld{
    public static int calavg(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        int a=3;
        int b=4;
        int c=4;
        int avg=calavg(a,b,c);
        System.out.println(avg);
    }
}

//or


import java.util.*;
public class HelloWorld{
    public static void calavg(int a,int b, int c){
      int avg=(a+b+c)/3;
      System.out.println(avg);
    }
    public static void main(String args[]){
        int a=3;
        int b=4;
        int c=4;
        calavg(a,b,c);
        
    }
}
