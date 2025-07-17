package Java15Journey;
import java.util.*;
public class BankingProgram {
    static double balance = 0.0;
    static void bal(Scanner in){
        System.out.printf("Balance : %.2f \n",balance);
    }
    static void Withdraw(Scanner in){
        if(balance<0){
            System.out.println("No money my friend");
            return;
        }
        System.out.print("Enter the amount: ");
        double a = in.nextDouble();
        if(a > balance){
            System.out.println("Be happy with what you have :)");
            return;
        }
        balance -= a;
        System.out.printf("New Balance : %.2f \n", balance);
    }
    static void Deposit(Scanner in){
        System.out.print("Enter the amount: ");
        balance += in.nextDouble();
        System.out.printf("New Balance : %.2f \n", balance);
    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to the worlds no 1 banking platform");
            System.out.println("1. Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose from the above : ");
            n = in.nextInt();
            switch (n) {
                case 1 -> bal(in);
                case 2 -> Withdraw(in);
                case 3 -> Deposit(in);
                case 4 -> {
                    System.out.println("Thank you for using my bank");
                    in.close();
                    return;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}
