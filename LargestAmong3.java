import java.util.Scanner;
public class LargestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.print("Enter the second number:");
		int b=sc.nextInt();
		System.out.print("Enter the third number:");
		int c=sc.nextInt();
		if((a>b)&&(a>c))
			System.out.println(a+" is Big");
		else if((b>c)&&(b>a))
			System.out.println(b+" is Big");
		else if((c>b)&&(c>a))
			System.out.println(c+" is Big");
		else
			System.out.println("Equal");
		

	}

}
