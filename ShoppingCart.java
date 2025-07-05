package Java15Journey;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What item would you like to buy? : ");
        String item = in.nextLine();
        System.out.println();
        System.out.print("What is the price for each? : ");
        double price = in.nextDouble();
        System.out.println();
        System.out.print("How many would you like? : ");
        int no = in.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("You have brought "+ no + " " + item+"'s");
        System.out.print("Your total is $"+no*price);
        in.close();
    }
}
