mport java.util.*;
public class JavaBasics{
    public static int CalcAvg(int a,int b,int c){
        return (a+b+c)/3;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Avg=CalcAvg(a,b,c);
        System.out.println(Avg);
        
    }
}





import java.util.*;
public class HelloWorld{
    public static boolean EvenorNot(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(EvenorNot(num)){
        System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}




import java.util.*;
public class HelloWorld{
    public static int SumOfNum(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        SumOfNum(num);
    }
}






