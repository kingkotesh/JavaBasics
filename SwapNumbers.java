import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		int a=sc.nextInt();
		System.out.print("Enter b value:");
		int b=sc.nextInt();
		System.out.println("Before Swapping:");
		System.out.print(a+"\t"+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("\nAfter Swapping:");
		System.out.print(a+"\t"+b);
		

	}

}
