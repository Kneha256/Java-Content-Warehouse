public class FirstJavaCode{
    public static void main(String[] args){
        System.out.println("My First Java Code");
    }
}



import java.util.*;
class VOte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
             System.out.println("Can Vote");
        }
        else{
            System.out.println("Cannot Vote");
  }
 }
}

import java.util.*;
class num_calc {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b){
    System.out.println("equal");
    }
        else if(a>b){
             System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
                }
    }
}



import java.util.*;
class ODD_EVEN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
             System.out.println("even number");
        }
        else{
            System.out.println("odd number");
         }
    }
}


