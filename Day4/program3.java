import java.util.*;
class Client3 {
    static void area(int h, int b){
        double area = 0.5*(h*b);
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter value of height : ");
        int h = sc.nextInt();
        System.out.println("Enter value of Base : ");
        int b = sc.nextInt();
        area(h, b);
    }   
}
