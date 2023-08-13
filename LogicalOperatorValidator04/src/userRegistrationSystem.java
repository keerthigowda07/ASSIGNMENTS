import java.util.Scanner;

public class userRegistrationSystem {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean input1=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean input2=scan.nextBoolean();
		isValidInput(input1, input2);
	}
	public static void isValidInput(boolean ip1, boolean ip2) 
	{
		if(ip1==true && ip2==true)
		{
			System.out.println("Input is Valid.");
		}
		else
		{
			System.out.println("Input is Invalid.");
		}
	}
}
