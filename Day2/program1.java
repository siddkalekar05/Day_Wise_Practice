/*Problem : 
Check given number is odd or even  */

import java.util.*;
class Demo1 {
    static void Check(int a){
        if(a==0){
            System.out.println(a+" is not even nor odd");
            return;
        }
        if(a%2==0){
            System.out.println(a+" is a even number");
        }else{
            System.out.println(a+" is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        Check(a);
    } 
}

