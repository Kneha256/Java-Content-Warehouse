// public class Advance_pattern{
//     public static void HollowRectangle(int nrows, int ncolms ){
//         for(int i=1;i<=nrows;i++){
//             for(int j=1;j<=ncolms;j++){
//                 if(i==1 || i==nrows || j==1 || j==ncolms ){
//                     System.out.print("*");
//                 }
//                 else{
//                 System.out.print(" ");}
//             }
//             System.out.println();
//         }
//         }
//         public static void main(String args[]){
//             HollowRectangle(4,5);
//     }
//     }


// public class Advance_pattern{
//     public static void inverted_half_pyramid(int n){
//         //outerloop
//         for(int i=1;i<=n;i++){
//             //space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //nextline
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         inverted_half_pyramid(5);

//     }
// }


// public class Advance_pattern{
//     public static void inverted_half_pyramid_with_number(int n){
//         int k=1;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(k);
//                 k++;
//             }
            
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         inverted_half_pyramid_with_number(5);
//     }
// }



// public class Advance_pattern{
//     public static void triangle_pattern_01(int n){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         triangle_pattern_01(5);
//     }
// }


//butterfly
// public class Advance_pattern{
//     public static void butterfly(int n){
//         //first half
//         for(int i=1;i<=n;i++){
//         //star
//         for(int j=1;j<=i;j++){
//          System.out.print("*");
//         }
//         //spaces
//         for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//             }
//         //star
//         for(int j=1;j<=i;j++){
//             System.out.print("*");

//         }
//         System.out.println();
//         }


//         //2nd half
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//             System.out.print("*");
//             }
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//                 }
//             //star
//             for(int j=1;j<=i;j++){
//             System.out.print("*");
       
//             }
//             System.out.println();}

//         }

    
//     public static void main(String args[]){
//         butterfly(4);
//     }
// }




//Solid rhombus
// public class Advance_pattern{
//     public static void Solid_Rhombus(int n){
//         for(int i=1;i<=n;i++){
//                 //spaces
//                 for(int j=1;j<=n-i;j++){
//                     System.out.print(" ");
//                 }
//                 //star
//                 for(int j=1; j<=n; j++){
//                     System.out.print("*");

//                 }
//                 System.out.println();
//             }        }
        
    
//     public static void main(String args[]){
//         Solid_Rhombus(5);

//     }
// }


// public class Advance_pattern{
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             //space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){
//                     System.out.print("*");

//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                
//             }System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         hollow_rhombus(5);
//     }
// }



//Diamond Pattern
// public class Advance_pattern{
//     public static void Diamond_pattern(int n){
//         //first half
//         for(int i=1;i<=n;i++){
//             //space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");
//              }
//              System.out.println();
//             }
//              //second half
//         for(int i=n;i>=1;i--){
//                 //space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//                 //star
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       

//     }
//     public static void main(String args[]){
//         Diamond_pattern(4);
//     }
// }




public class Advance_pattern{
    public static void Number_Pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //number
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            //nextline
            System.out.println();
        }

    }
    public static void main(String args[]){
        Number_Pyramid(5);
    }
}