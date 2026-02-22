import java.util.Scanner;
public class Right_Aligned_Traingle {

    public static void main(String[] args){

        System.out.println("Right-Aligned Triangle ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print right-aligned triangle");
        int num = scan.nextInt();
        // checking if the user enters 0 or less than zero
        if(num == 0|| num < 0){
            System.out.println("zeros and negative numbers cannot form a patterns ");
        }

        // Outer loop for rows //
        for(int i = 1; i <= num; i++){
            // inner loop for columns //
            for(int j = 1; j <= num; j++){
                if(j <= num - i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
