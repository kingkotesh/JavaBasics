import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int k=n;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
		}
		//System.out.println(sum);
		if(sum==k)
			System.out.println(k+" is Perfect Number");
		else
			System.out.println(k+" is Not Perfect Number");
	}

}
