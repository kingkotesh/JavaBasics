import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(n+"x"+i+"="+n*i);
	}

}
