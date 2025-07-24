package Day19;

public class ArrayIndex {
        public static void main(String[] args) {
			try {
				int[] numbers = {1,2,3};
				System.out.println(numbers[10]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index is out of bounds");
			}
		}
}
//10 exception
//arithmetic
//custom
//array index out of bounds
//null-pointers