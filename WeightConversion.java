package Java15Journey;
import java.util.*;
public class WeightConversion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        int n = in.nextInt();
        if(n==1){
            System.out.print("Enter the weight in lbs: ");
            double weight = in.nextDouble();
            System.out.printf("The new weight in kgs is: %.2f",weight/2.20462);
        }
        else if(n==2){
            System.out.print("Enter the weight in kgs: ");
            double weight = in.nextDouble();
            System.out.printf("The new weight in lbs is: %.2f",weight*2.20462);
        }
        else{
            System.out.println("Invalid input");
        }
        in.close();
    }
}
