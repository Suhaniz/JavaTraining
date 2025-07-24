package Day17;

import java.util.Scanner;

public class FrequencyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + "\t" + count);
        }

        sc.close();
    }
}
