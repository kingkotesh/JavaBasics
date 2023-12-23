import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=c.nextInt();
		int m=n;
		int l=length(n);
		//System.out.println("Length of the number: "+l);
		int r,sum=0;
		while(n!=0) {
			r=n%10;
			sum+=(int)Math.pow(r,l);
			n=n/10;
		}
		//System.out.println(sum);
		//System.out.println((int)Math.pow(2,l));
		if(m==sum)
			System.out.println(m+" is Amstrong Number");
		else
			System.out.println(m+" is Not Amstrong Number");
		
	}
	public static int length(int n) {
		int k=0;
		while(n!=0) {
			k=k+1;
			n=n/10;
		}
		return k;
	}
}
