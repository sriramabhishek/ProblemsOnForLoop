import java.util.Scanner;
public class Factorial_Of_A_Given_Number {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to generate factorial of it: ");
        int factorialNumber = scan.nextInt();
        long mul = 1;
        if(factorialNumber < 0){
            System.out.println("Please check number again ....");
        }else{
            for(int i = 1; i<=factorialNumber; i++){
                mul = mul * i;
            }
            System.out.println("The Factorial of a given number : " +mul);
        }



    }
}
