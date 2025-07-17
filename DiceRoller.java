package Java15Journey;
import java.util.*;
public class DiceRoller{
    static void one(){
        System.out.println("""
            -------
           |       |
           |   ●   |
           |       |
            ------- 
        """);
    }
    static void two(){
        System.out.println("""
            -------
           | ●     |
           |       |
           |     ● |
            ------- 
        """);
    }
    static void three(){
        System.out.println("""
            -------
           | ●     |
           |   ●   |
           |     ● |
            ------- 
        """);
    }
    static void four(){
        System.out.println("""
            -------
           | ●   ● |
           |       |
           | ●   ● |
            ------- 
        """);
    }
    static void five(){
        System.out.println("""
            -------
           | ●   ● |
           |   ●   |
           | ●   ● |
            ------- 
        """);
    }
    static void six(){
        System.out.println("""
            -------
           | ●   ● |
           | ●   ● |
           | ●   ● |
            ------- 
        """);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int sum = 0;
        System.out.print("Enter the number of dices to roll: ");
        int n = in.nextInt();
        if (n > 0){
            for (int i=0; i<n; i++){
                int no = ran.nextInt(1,7);
                sum+=no;
                switch(no){
                    case 1 -> one();
                    case 2 -> two();
                    case 3 -> three();
                    case 4 -> four();
                    case 5 -> five();
                    case 6 -> six();
                }
            }
            System.out.println("The total sum : "+sum);
            in.close();
        }
        else{
            System.out.println("Invalid Input");
            in.close();
        }
    }
}
