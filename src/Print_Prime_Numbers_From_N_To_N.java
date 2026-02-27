import java.util.Scanner;
public class Print_Prime_Numbers_From_N_To_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start value to iterate : ");
        int start = scan.nextInt();
        System.out.print("Enter End value to stop : ");
        int end = scan.nextInt();

        //Nested Loop Logic //
        for (int i = start; i <= end; i++) {
            if (i == 0 || i == 1) {
                System.out.println("zero and one are not perfect numbers to start ...");
                break;
            }

            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }

        }

    }
}