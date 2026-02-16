import java.util.*;
public class Print_Sum_Of_N_NaturalNumbers {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to sum of N natural numbers... ");
        int num = scan.nextInt();
        int sum  = 0;          //- o(1)//
        for(int i = 1; i <= num; i++){
            sum= sum + i;
        }
        System.out.println(sum);

    }
}
