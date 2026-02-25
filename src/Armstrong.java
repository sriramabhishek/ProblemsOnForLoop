import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value to check it is a Armstrong number or not");
        if(!scan.hasNextInt()){
            System.out.println("Decimal numbers cannot be supported try with integers");
        }
        int arm_Num = scan.nextInt();
        int temp = arm_Num;
        int pow_sum = 0;
        int digits = String.valueOf(arm_Num).length();

        // While loop to iterate
        while(temp != 0){
            //fetching the last digit
            int remainder = temp % 10;
            pow_sum = (int) Math.pow(remainder, digits) + pow_sum;
            temp /= 10;
        }
        if(arm_Num == pow_sum){
            System.out.println(arm_Num+ " is a Armstrong number");
        }else{
            System.out.println(arm_Num+ " is not a Armstrong Number");
        }
    }
}
