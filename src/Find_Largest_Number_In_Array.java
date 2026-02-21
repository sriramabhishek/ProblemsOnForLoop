public class Find_Largest_Number_In_Array {

    public static void main(String[] args){

        //Initialization and Declaration of Array
        int[] arr = {10, 25, 5, 40, 15};
        int size = arr.length;
        int highest_Number = 0;
//        System.out.println(size);
        for(int i = 0; i < size-1; i++){
            if(arr[i] > arr[i+1]) {
                highest_Number =  arr[i];
            }

        }
        System.out.println(highest_Number);
    }
}
