import java.util.*;
public class arraydefine{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
        int[] marks=new int[size];
    for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
      }
        for(int i=0;i<size;i++){
          System.out.println(marks[i]);
        }
        }
}


import java.util.*;
public class IndexNo{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
        int[] arr=new int[size];
    int n=20;
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
    for(int i=0;i<size;i++){
            if(arr[i]==n){
                 System.out.println(i);
            }
     }
  }
}





import java.util.*;
public class IndexNo{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
    
      for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
     int num=sc.nextInt();
     for(int i=0;i<size;i++){
            if(arr[i]==n){
                 System.out.println(i);
            }
     }
  }
}
     //or

import java.util.*;
public class IndexNo{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
    
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
        }
     int num=sc.nextInt();
     for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                 System.out.println(i);
            }
     }
  }
}



import java.util.*;
public class Arr{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int[][] arr=new int[row][col];
    for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              arr[i][j]=sc.nextInt();
            }
      }
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
             }
            System.out.println();
        }}
          
        int col=sc.nextInt();
    
    

import java.util.*;
public class Arr{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
        int col=sc.nextInt();
    int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
                             }
        }
    int n=sc.nextInt();
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
               if(arr[i][j] == n) {
                  System.out.println(i+","+j);
               }
          }
