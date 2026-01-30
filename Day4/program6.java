import java.util.*;
class Client6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Wlc to Gold Caffe");
                System.out.println("Menu list : ");
                System.out.println("1.Pizza");
                System.out.println("2.Burger");
                System.out.println("3.Sandwitch");
                System.out.println("4.Frenzefrize");
                System.out.println("5.Coffee");
                System.out.println("Enter number of item to order : ");
                int item = sc.nextInt();
                int sum = 0;
                int priceP = 120;
                int priceB = 60;
                int priceS = 50;
                int priceF = 70;
                int priceC = 40;
                for(int i=0;i<item;i++){
                            System.out.println("Enter your order : ");
                             String order = sc.next();
                                     switch(order){
                                        case "Pizza":
                                                System.out.println("Your order is confirm price is "+priceP+" rs");
                                                sum+=priceP;
                                                break;
                                        case "Burger":
                                                System.out.println("Your order is confirm price is "+priceB+" rs");
                                                sum+=priceB;
                                                break;
                                        case "Sandwitch":
                                                System.out.println("Your order is confirm price is "+priceS+" rs");
                                                sum+=priceS;
                                                break;
                                        case "Frenzefrize":
                                                System.out.println("Your order is confirm price is "+priceF+" rs");
                                                sum+=priceF;
                                                break;
                                        case "Coffee":
                                                System.out.println("Your order is confirm price is "+priceC+" rs");
                                                sum+=priceC;
                                                break;
                                        default:
                                                System.out.println("Plz enter valid item");
                                                    }
                                             }
                System.out.println("Total price : "+sum);
                System.out.println("Don't waste food or you will be fined");
        }
}
