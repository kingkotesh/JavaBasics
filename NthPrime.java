import java.util.Scanner;
public class NthPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int pc=0;
		int i=2;
		while(n!=pc) {
			int k=prime(i);
			if(k==1)
				pc+=1;
			i+=1;
		}
		System.out.println(n+"th prime number is: "+(i-1));
	}
	public static int prime(int n) {
		if((n==0)||(n==1))
			return 0;
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					return 0;
			}
		}
		return 1;
	}
}
