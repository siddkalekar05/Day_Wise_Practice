/*Problem : 
Fibonaccii series upto n  */

import java.util.*;
class Demo6 {
    static void fibona(int a){
        int f1 = 0;
        int f2 = 1;
        System.out.print(f1+" ");
        for(int i = 1;i<a;i++){
            int f3 = f1+f2;
            System.out.print(f3+" ");
            f1 = f2;
            f2 = f3;
        }
	System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        fibona(a);
    } 
}

