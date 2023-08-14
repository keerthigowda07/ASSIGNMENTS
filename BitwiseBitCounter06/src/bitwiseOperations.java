import java.util.Scanner;

public class bitwiseOperations {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer=input.nextInt();
		System.out.println("Number of set bits: "+ countSetBits(integer));
	}
public static int countSetBits(int a) 
{
	int count=0;
	while(a>0)
	{
		count+=a&1;
		a>>=1;
	}
	return count;
}
}
