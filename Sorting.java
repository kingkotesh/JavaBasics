import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the array element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("\nAfter Sorting");
		int temp;
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}
