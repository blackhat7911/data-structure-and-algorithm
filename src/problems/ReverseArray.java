package problems;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args){
        int size = 4;
        int[] arr = {1, 2, 3, 4};
        reverseArray(size, arr);
    }
    static void reverseArray( int size, int[] arr){
        int[] revArr = new int[size];
        int revSize = size;
        for(int i=0; i<size; i++){
            revArr[revSize - 1] = arr[i];
            revSize = revSize - 1;
        }
        System.out.print("Original Array is: ");
        System.out.print(Arrays.toString(arr));
        
        System.out.println();
        
        System.out.print("Reversed Array is: ");
        System.out.print(Arrays.toString(revArr));
    }
}
