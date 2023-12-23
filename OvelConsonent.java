import java.util.Scanner;
public class OvelConsonent {

	public static void main(String[] args) {
		int ov=0,cv=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				ov+=1;
			}
			else
				cv+=1;
		}
		System.out.println(s);
		System.out.println(ov);
		System.out.println(cv);
	}

}
