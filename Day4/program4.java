import java.util.*;
class Client4 {
    static void area(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<=r-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter number of rows  : ");
        int r = sc.nextInt();
        area(r);
    }   
}
