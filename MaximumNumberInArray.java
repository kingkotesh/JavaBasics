import java.util.Scanner;
public class MaximumNumberInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the array element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximum element is: "+maxi(arr));
	}
	public static int maxi(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

}
