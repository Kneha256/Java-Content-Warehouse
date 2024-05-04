class HelloWorld {
    public static void main(String[] args) {
       for(int i=0;i<100;i+=1){
            System.out.println("helloWorld"); }
    }  }


class HelloWorld {
    public static void main(String[] args) {
       for(int i=0;i<=10;i+=1){
            System.out.println(i); }
    }  }


   class HelloWorld {
    public static void main(String[] args) {
      int i = 0;
       while(i<=10){
            System.out.println(i); 
             i++;
       }
    }  
   }


class HelloWorld {
    public static void main(String[] args) {
      int i = 0;
       do{
            System.out.println(i); 
             i++;
       }while(i<11);
    }  
}


class HelloWorld {
    public static void main(String[] args) {
      int sum = 0;
      for(int i=1;i<=5;i++){
        sum+=i;
         System.out.println(sum);
             }
    }  
}



class HelloWorld {
    public static void main(String[] args) {
      int i = 1;
      int sum = 0;
      while(i<=5){
          sum+=i;
        System.out.println(sum);
         i++;
      }
    }
}




class HelloWorld {
    public static void main(String[] args) {
      int i = 1;
      int sum = 0;
      do{
          sum+=i;
        System.out.println(sum);
         i++;
      }while(i<=5);
    }
}


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum = 0;
      for(int i=1;i<=n;i++){
      sum+=i;
      System.out.println(sum);
       }
    }  
}


import java.util.*;
class HelloWorld {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      for(int i=1;i<=10;i++){
        System.out.println(n + " * " + i + " = " + i*n);
      }
      }  
} 
