import java.util.Scanner;

public class taxCalculatorApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount=input.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double taxRate=input.nextDouble();
		System.out.println("Total cost including tax: "+calculateTotalWithTax(purchaseAmount, taxRate));
	}
	public static double calculateTotalWithTax(double pa, double ta) 
	{
		return pa+(pa*ta);
	}
}
