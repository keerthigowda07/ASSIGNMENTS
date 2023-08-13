import java.util.Scanner;

public class bitwiseSwapperApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int firstInteger=input.nextInt();
		System.out.println("Enter the second integer: ");
		int secondInteger=input.nextInt();
		swapUsingBitwise(firstInteger, secondInteger);
	}
	public static void swapUsingBitwise(int first, int second) 
	{
		int firstInt= first ^ second;
		int secondInt1= firstInt ^ second;
		int firstInt1= firstInt ^ secondInt1;
		System.out.println("After swapping: First = "+ firstInt1+", Second = "+secondInt1);
	}
}
