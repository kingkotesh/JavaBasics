import java.util.Scanner;
public class InterChangingCaseLetters {
	public static void main(String[] args) {
		//char c='k';
		System.out.print("Enter a string:");
		String k="";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				k+=Character.toUpperCase(s.charAt(i));
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				k+=Character.toLowerCase(s.charAt(i));
			}
		}
		System.out.print(k);
	}

}
