/*Problem : 
Swap two numbers without using  a temporary variables */

import java.util.*;
class Demo2 {
    static void swap(int a,int b){
       a = a+b;
       b = a-b;
       a = a-b;

        System.out.println("After swapping : "+a+ " "+(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        System.out.println("Enter no b : ");
        int b = sc.nextInt();
        System.out.println("Number before swapeed : "+ a + " "+(b));
        swap(a,b);
    }
    
}

