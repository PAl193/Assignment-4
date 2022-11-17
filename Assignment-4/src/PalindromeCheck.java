import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string for palindrome check");
		String str=sc.next();
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("String is not Palindrome!");
				break;
			}
			i++;
			j--;
		}
		if(i>=j) {
			System.out.println("String is Palindrome");
		}
		
	}

}
