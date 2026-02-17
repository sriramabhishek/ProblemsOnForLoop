import java.math.*;
import java.util.*;
public class Factorial_Of_A_Given_Number_Beyond {

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        if (!scan.hasNextInt()){
            System.out.println("Please enter a valid integer.");
        }
        int number = scan.nextInt();

        BigInteger fact = BigInteger.ONE;
        if(number < 0){
            System.out.println("factorial is not defined as a negative number");
        }
        else{
            for(int i = 2; i <= number; i++){
               fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of a given number : "+fact);
        }
    }
}
