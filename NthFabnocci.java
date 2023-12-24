import java.util.Scanner;

public class NthFabnocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int k=fabnocci(n-1);
		System.out.println(n+"th term is: "+k);

	}
	public static int fabnocci(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fabnocci(n-1)+fabnocci(n-2);
	}
}
