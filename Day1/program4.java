/*Problem : 
reverse the number  */

import java.util.*;
class Demo4 {
    static void reverse(int a){
        int rev = 0;
        int temp = a;
        int r = 0;
        while(temp>0){
            r = temp%10;
            rev = rev*10+r;
            temp = temp/10;
        }
        System.out.println("Reverse number : "+rev);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        System.out.println("Original no : "+a);
        reverse(a);
    }
    
}

