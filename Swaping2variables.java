import java.util.Scanner;
public class Swaping2variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		int a=sc.nextInt();
		System.out.print("Enter b value:");
		int b=sc.nextInt();
		System.out.println("Before Swapping:");
		System.out.print(a+"\t"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nAfter Swapping:");
		System.out.print(a+"\t"+b);

	}

}
