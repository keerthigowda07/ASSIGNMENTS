import java.util.Scanner;

public class weatherApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner input=new Scanner(System.in);
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			double tempInCelsius=input.nextDouble();
			System.out.println(tempInCelsius+"°C is equivalent to "+celsiusToFahrenheit(tempInCelsius)+"°F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit: ");
			double tempInFahrenheit=input.nextDouble();
			System.out.println(tempInFahrenheit+"°F is equivalent to "+fahrenheitToCelsius(tempInFahrenheit)+"°C");
			break;
		default:
			System.out.println("invalid choice!");
		}
	}
	
	public static double celsiusToFahrenheit(double celsius)
	{
		double temp= (celsius * 9/5) + 32;
		return temp;
	}
			
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		double temp= (fahrenheit - 32) * 5/9;
		return temp;
	}
}
		
