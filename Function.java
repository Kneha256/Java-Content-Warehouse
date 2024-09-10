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


import java.util.*;
public class HelloWorld{
    public static int calavg(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=calavg(a,b,c);
        System.out.println(avg);
    }
}




public class Advance_pattern{
    public static void HollowRectangle(int nrows, int ncolms ){
        for(int i=1;i<=nrows;i++){
            for(int j=1;j<=ncolms;j++){
                if(i==1 || i==nrows || j==1 || j==ncolms ){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");}
            }
            System.out.println();
        }
        }
        public static void main(String args[]){
            HollowRectangle(4,5);
    }
}




public class Advance_pattern{
    public static void inverted_half_pyramid(int n){
        //outerloop
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //nextline
            System.out.println();
        }

    }
    public static void main(String args[]){
        inverted_half_pyramid(5);

    }
}
