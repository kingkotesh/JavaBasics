import java.util.Scanner;
public class LinearSearching {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter array element:");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter search element:");
		int se=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(se==arr[i]) {
				System.out.println("Element found and it is: "+se);
				System.exit(0);
				//break;
				
			}
			else 
				continue;
		}
		System.out.println("Element Not found :"+se);
	}

}
