import java.util.*;
public class arrayCC{
    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            }
            return -1;

        }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18};
        int key=20;

        int index =linearSearch(numbers, key);
        if(index == -1){
            System.out.print("Not Found");
        }else{
            System.out.print("Key is at index: "+index);
        }

    }
}


import java.util.*;

public class Hello {
    public static int LinearSearch(int arr[], int key){
      for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
          return i;
        }
        }
        return -1;
      }
    
    public static void main(String[] args) {
      int arr[]={2,4,6,8,9,10,12,16};
      int key=10;
      int index=LinearSearch(arr,key);
      if(index==-1){
        System.out.println("Key not found");
      }
      else{
        System.out.println("Key found at index : "+ index);
      }
      
  }
}


import java.util.*;

public class Hello {
    public static int LinearSearch(String arr[], String key){
      for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
          return i;
        }
        }
        return -1;
      }
    
    public static void main(String[] args) {
      String arr[]={"apple","banana","orange","lichi","pineapple"};
      String key="orange";
      int index=LinearSearch(arr,key);
      if(index==-1){
        System.out.println("Key not found");
      }
      else{
        System.out.println("Key found at index : "+ index);
      }
      
  }
}

import java.util.*;

public class Hello {
    public static int getvalue(int numbers[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        if(numbers[i]>largest){
          largest=numbers[i];
        }
      }
      return largest;
    }
    
    public static void main(String[] args) {
      int numbers[]={2,3,4,9,5,8};
      System.out.println("largest number is : "+getvalue(numbers));
      
  }
}


#printPairs of given array
    import java.util.*;

public class Main {
    public static void Pair(int numbers[]){
    for(int i=0;i<numbers.length;i++){
      int curr=numbers[i];
      for(int j=i+1;j<numbers.length;j++){
        System.out.print("(" + curr + "," + numbers[j] + ")");
      }
      System.out.println();
    }
      
    }
    public static void main(String[] args) {
     int numbers[]={1,2,3,4,5,6};
     Pair(numbers);
  }
}
