import java.util.Scanner;
public class MinimumNumberInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the array element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Minimum element is: "+mini(arr));
	}
	public static int mini(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}

}
