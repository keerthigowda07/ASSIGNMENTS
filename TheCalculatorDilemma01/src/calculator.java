import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		char operator;
		double num1, num2;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose an Operator: +, -, * or /");
		operator=input.next().charAt(0);
		System.out.println("Enter Number1 and Number2");
		num1=input.nextDouble();
		num2=input.nextDouble();
		calculation(operator,num1,num2);
	}
	public static void calculation(char operator, double number1, double number2)
	{
		switch(operator)
		{
		case '+':
			System.out.println(number1+" + "+number2+" = "+(number1+number2));
			break;
		case '-':
			System.out.println(number1+" - "+number2+" = "+(number1-number2));
			break;
		case '*':
			System.out.println(number1+" * "+number2+" = "+(number1*number2));
			break;
		case '/':
			System.out.println(number1+" / "+number2+" = "+(number1/number2));
			break;
		default:
			System.out.println("Invalid Operatior!");
	}
    }
}