import java.util.Scanner;
public class LcmOf2Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		int i=1;
		int k=b;
		while(true) {
			if(b%a==0) {
				System.out.println("Lcm= "+b);
				break;
			}
			else {
				i+=1;
				b=k*i;
			}
		}
	}
}
