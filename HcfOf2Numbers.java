import java.util.Scanner;
public class HcfOf2Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		int x=lcm(a,b);
		int hcf=(a*b)/x;
		System.out.println("Hcf= "+hcf);
	}
	public static int lcm(int a,int b) {
		int i=1;
		int k=b;
		while(true) {
			if(b%a==0) {
				return b;
			}
			else {
				i+=1;
				b=k*i;
			}
		}
	}
}
