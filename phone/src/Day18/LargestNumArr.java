package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumArr {
   public static void main(String[] args) {
	int n,k;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Input -");
	n=scanner.nextInt();
	k=scanner.nextInt();
	
	int a[] = new int[n];
	
	for (int i=0;i<n;i++) {
		a[i]=scanner.nextInt();
	}
	Arrays.sort(a);
	System.out.println(a[n-k]+":is the"+k+"th largest");
}
}