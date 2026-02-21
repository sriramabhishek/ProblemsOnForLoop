import java.util.*;
public class ChecK_The_Given_Number_Is_Prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not : ");
        if(!scan.hasNextInt()){
            System.out.println("Decimal Numbers are not supported to check it is a prime or not ");
        }
        int prime_number = scan.nextInt();

        if(prime_number <= 1){
            System.out.println("Zero, one, and negative numbers are not prime.");
            return;
        }

        if(prime_number == 2){
            System.out.println(prime_number + " is a prime number");
            return;
        }

        if(prime_number % 2 == 0){
            System.out.println(prime_number + " is not a prime number");
            return;
        }

        boolean isPrime = true;

        for(int i = 3; i * i <= prime_number; i += 2){
            if(prime_number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(prime_number + " is a prime number");
        } else {
            System.out.println(prime_number + " is not a prime number");
        }
    }
}
