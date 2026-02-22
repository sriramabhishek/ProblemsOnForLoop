import java.util.*;
public class Star_Pattern_Right_Angle_Column_Wise {

    public static void main(String[] args){

        System.out.println("Right angle triangle using col-wise ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        if(num == 0 || num < 0){
            System.out.println("zeros and negatives cannot form a patterns");
        }
        for(int i = 1; i<=num; i++){   //.....Column-Wise Patterns ......//
            for(int j = 1; j <= num; j++){
                if(j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
