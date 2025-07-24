package Day15;

public class ArrDemo2 {
	
    public static void main(String[] args) {
        // 1. Declaration and Initialization in One Step
        int[] numbers1 = {1, 2, 3, 4, 5}; 
        
        // Print results
        System.out.println("numbers1:");
        for (int num : numbers1) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nnames1:");

        // Store names: string type
        String[] names1 = {"Ram", "Shyam", "Sita"}; 

        for (String name : names1) {
            System.out.println(name); 
        }
        
        
        // 2. Declaration and Separate Initialization
        int[] numbers2;        
        numbers2 = new int[5];  
        
        

        // 3. Declaration with Specified Size
        int[] numbers3 = new int[5];        
        String[] names2 = new String[3];    
        
        

        // 4. Multidimensional Arrays (2D array)
        int[][] matrix1 = new int[3][3];     

        int[][] matrix2 = {                   
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        

        // 5. Using the new keyword with Initial Values
        int[] numbers4 = new int[]{1, 2, 3, 4, 5}; 
        String[] names3 = new String[]{"Karan", "Arjun", "Bushara"};

        // 6. Array with Dynamic Size
        int size = 10;
        int[] numbers5 = new int[size];

        // 7. Empty Array
        int[] numbers6 = new int[0]; 
        String[] names4 = new String[0]; 
    }
}