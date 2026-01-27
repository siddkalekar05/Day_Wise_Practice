/*Problem : 
Swap two numbers using a temporary variables */

import java.util.*;
class Demo1 {
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

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

