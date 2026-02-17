import java.util.Scanner;

public class Count_Digits_Of_A_Number {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value to be counted : ");
        int numbers = scan.nextInt();
        int count = 0;
        int last = 0;
        while(numbers > 0){
            numbers = numbers / 10;
            count++;
        }
        System.out.println("Total Digits : " +count);


    }
}
