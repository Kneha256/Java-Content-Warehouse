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
