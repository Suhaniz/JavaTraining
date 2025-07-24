package Day4;

import java.util.Scanner;

//Celsius to Fahrentheit 

/*public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter temperature in Celicius:");
		double cel  = sc.nextDouble();
		
		double fahren = (cel*9/5)+32;
		
		System.out.println("Temperature in Fahrenheit:"+fahren);	
	}
}
//double cel
//formula = (celsius*9/5)+32
*/
//Fahrentheit to Celsius 

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " °F = " + celsius + " °C");

        sc.close();
    }
}

// Formula => Celsius = (Fahrenheit - 32) × 5 / 9

