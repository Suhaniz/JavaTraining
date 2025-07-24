package Day15;

public class ArrayDemo {
    public static void main(String[] args) {
		//Declaration and Initialization
    	int[] numbers = new int[5]; //Array of 5 integers --> size 5
    	//syntax dt[] arr_name = new dt[size];
    	
    	//Assign Values
    	
    	numbers[0]=10; //0th position pe store hoga
    	numbers[1]=20; //1st position pe store hoga
    	numbers[2]=20; //2nd position pe store hoga
    	numbers[3]=20; //1st position pe store hoga
    	numbers[4]=20; //1st position pe store hoga
    	
    	for (int i=0;i< numbers.length;i++) {
    		System.out.println("Element at Index "+ ":"+numbers[i]);
    	}
	}
}