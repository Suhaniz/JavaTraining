/*Question - WAJP to move zero to End in an array*/

package Day16;

public class MovesZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 0, 3, 10, 0, 7}; // Input array
        int n = arr.length;

        // Create a result array
        int[] result = new int[n];
        
        int index = 0;

        // First add all non-zero elements
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        System.out.println("Array after moving 0's to the end:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
