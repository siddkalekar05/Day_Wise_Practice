/*Problem : 
Find largest b/w three numbers 
numbers takes from user   */

import java.util.*;
class Demo2 {
    static void Check(int a, int b , int c){
        if(a>b&&a>c){
            System.out.println(a+" is Greatest Number");
        }else if(b>c){
            System.out.println(b+" is Greatest Number");
        }else{
            System.out.println(c+ " is Greatest Number");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        System.out.println("Enter no b : ");
        int b = sc.nextInt();
        System.out.println("Enter no c : ");
        int c = sc.nextInt();
        Check(a,b,c);
    } 
}

