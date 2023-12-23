import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.println(n+" is "+isPrime(n));
	}
	public static String isPrime(int n) {
		if(n==0 || n==1) 
			return "Not Prime Number";
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					return "Not Prime Number";
			}
		}
		return "Prime Number";
	}
}
