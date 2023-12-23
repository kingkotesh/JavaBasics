import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int r;
		int k=n;
		int sum=0;
		while(n!=0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==k)
			System.out.println(k+" Palindrome");
		else
			System.out.println(k+" Not Palindrome");
	}

}
