/*Problem : 
count digit in given number */

import java.util.*;
class Demo5 {
    static void countDigit(int a){
        int temp = a;
        int count = 0;
        if(temp<=0){
            System.out.println("Enter valid number");
        }else{
            while(temp>0){
             temp = temp/10;
            count++;
            }
        System.out.println("Digit in number  : "+count);
    
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        System.out.println("Original no : "+a);
        countDigit(a);
    }
    
}

