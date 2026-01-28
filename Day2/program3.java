/*Problem : 
Sum of digits present in given number */

import java.util.*;
class Demo3 {
    static void sum(int a){
        int temp = a;
        int sum = 0;
        if(temp==0){
            System.out.println("Enter valid number");
            return;
        }else{
            while(temp>0){
                sum+=temp%10;
                temp = temp/10;
            }
            System.out.println("Sum of digits : "+sum);
        }
       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        sum(a);
    } 
}

