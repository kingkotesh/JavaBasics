import java.util.Scanner;
public class ArithematicOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.print("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Addition= "+add(a,b));
		System.out.println("Subtraction= "+sub(a,b));
		System.out.println("Multiplication= "+mul(a,b));
		System.out.println("Division= "+div(a,b));
		System.out.println("Mod-Division= "+mdiv(a,b));
		
	}

	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static int mdiv(int a,int b) {
		return a%b;
	}
	
}
