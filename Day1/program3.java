/*Problem : 
chech given number is prime or not  */

import java.util.*;
class Demo3 {
    static void prime(int a){
        int count=0;
      if(a==0 || a == 1){
        System.out.println(a+" is not prime");
        return;
      }else if(a==2){
        System.out.println(a+" Is prime");
        return;
      }else{
        for(int i = 1;i<=a/2;i++){
            if(a%i==0){
                count++;
            }
        }
        System.out.println(count);//which we get iteration count due to a/2 and count+1 we save our 50% iteration
      }
      if((count+1)==2){
        System.out.println(a+ " is prime");
      }else{
        System.out.println(a+" is not prime");
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        prime(a);
    }
    
}

