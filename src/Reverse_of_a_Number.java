import java.util.*;
public class Reverse_of_a_Number {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value to reverse a number : ");
        if(!scan.hasNextInt()){
            System.out.println("Decimal values cannot be reversed ,please check again ");
        }
        int num = scan.nextInt();
        int rev = 0;
        if(num < 10){
            System.out.println("Negative numbers and single digit's cannot be reversed , check again ");
        }
        else{
            while(num > 0){
              int rem = num % 10;
              rev = rev * 10 + rem;
              num/=10;
            }
            System.out.println("Reversed number :" +rev);
        }

    }
}
