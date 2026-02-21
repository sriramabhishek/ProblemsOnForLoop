import java.util.Scanner;
public class Fibonacci_Series {

    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num = scan.nextInt();
        int first = 0, second = 1;
        for(int i = 1; i <= num ; i++){
            System.out.print(first+ " ");
            int add = first + second;
            first = second;
            second = add;
        }


    }
}
