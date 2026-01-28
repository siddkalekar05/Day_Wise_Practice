/*Problem : 
Print patter : 
    for r = 4
    *
    **
    ***
    ****
     */

import java.util.*;
class Demo5 {
    static void pattern(int r){
        for(int i=0;i<=r;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no rows : ");
        int r = sc.nextInt();
        pattern(r);
    } 
}

