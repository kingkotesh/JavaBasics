import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int sum=0;
		int r;
		while(n!=0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Reverse number is: "+sum);
	}

}
