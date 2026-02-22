import java.util.*;
public class Star_Pattern_Right_Traingle {

    public static void main(String[] args){
        System.out.println("Right angle triangle ...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print patterns ");
        int num = scan.nextInt();
        if(num == 0 || num < 0){
            System.out.println("zero's and negative values cannot print a value ");
        }

        for(int i=1; i<=num; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
            System.out.println();
        }


    }
}
