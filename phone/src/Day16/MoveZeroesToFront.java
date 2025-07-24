/*Question - WAJP to move zero to front in an array*/

package Day16;

public class MoveZeroesToFront {
    public static void main(String[] args) {
        int[] arr = {10, 0, 3, 0, 50, 25, 0, 15 }; // Input array
        int n = arr.length;

        // Create a new array to store the result
        int[] result = new int[n];

        // Count the number of zeroes
        int zeroCount = 0; 

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Fill the result array with zeroes first
        for (int i = 0; i < zeroCount; i++) {
            result[i] = 0;
        }

        // Place non-zero elements after the zeroes
        int index = zeroCount; 
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        // Print the modified array
        System.out.println("Array after moving 0's to the front:");
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
}
