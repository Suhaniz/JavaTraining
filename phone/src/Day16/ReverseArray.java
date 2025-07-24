/*Question - WAJP to Reverse an Array*/

package Day16;

public class ReverseArray {
   public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int left =0,right=arr.length-1;
	
	while(left<right) {
		int temp = arr[left]; //3 rd variable i.e. temp
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
	}
	System.out.println("Reversed Array is: ");
	for(int num : arr) { //enhanced for loop or for each loop 
		System.out.println(num+ " ");
	}
}
}
