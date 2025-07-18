package Java15Journey;
import java.util.*;
public class Compoundinterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double pri = in.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double inter = in.nextInt();
        inter/=100;
        System.out.print("Enter the number of times of compount per year: ");
        int n = in.nextInt();
        System.out.print("Enter the no of years: ");
        int t = in.nextInt();
        System.out.print("The amount after one years is Rs.");
        double rateofint = pri * Math.pow(1+inter/n,n*t);
        System.out.printf("%.2f",rateofint);
        in.close();
    }
}
