import java.util.Scanner;
public class Using_WhileLoop_To_PrintSumOf_N_NaturalNumbers
{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int i = 1, sum = 0;
        while(i <= num){

          sum = sum + i;
          i++;
        }
        System.out.println(sum);
    }

}
