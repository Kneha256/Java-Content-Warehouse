public class Prime_Number{
    public static void main(String[] args){
      int n=5;
        if(n%n==0){
          System.out.println("prime");}
        else{
           System.out.println("non prime");
        }
       }}



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


import java.util.*;
class GREETING {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        if(button==1){
             System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Bonjour");
        } 
        else{
            System.out.println("Invalid button");
        }
 }
}




import java.util.*;
class GREETING {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjor");
            break;
            default:System.out.println("Invalid input");
        }
 }
    
}



