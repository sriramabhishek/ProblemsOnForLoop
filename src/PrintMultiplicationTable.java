import java.util.*;
public class PrintMultiplicationTable {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table : ");
        int num = scan.nextInt();
        for(int  i = 1; i <= 10; i++ ){
            System.out.println(num+ " * " + i + " = " +(num * i)) ;
        }

    }
}
