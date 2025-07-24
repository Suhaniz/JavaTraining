package Day15;

public class RatCountHouse {
	
	    public static int minHouses(int r, int unit, int[] arr) {
	        if (arr == null) return -1;

	        int requiredFood = r * unit;
	        int currentFood = 0;

	        for (int i = 0; i < arr.length; i++) {
	            currentFood += arr[i];
	            if (currentFood >= requiredFood) {
	                return i + 1; // because index starts from 0
	            }
	        }

	        return 0; // Not enough food
	    }

	    public static void main(String[] args) {
	        int r = 7;
	        int unit = 2;
	        int[] arr = {2, 8, 3, 5, 3, 4, 1, 2};

	        int result = minHouses(r, unit, arr);
	        System.out.println("Output: " + result);
	    }
	}

