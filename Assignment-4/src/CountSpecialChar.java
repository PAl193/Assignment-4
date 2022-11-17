import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string for counting special and vowels character");
		String str=sc.next();
		int count=0;
		char []ch= {'A','E','I','O','U','a','i','e','o','u','@','#','$','%','&','%','*'};
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<ch.length;j++) {
				if(str.charAt(i)==ch[j]){
					count++;
				}
			}
			
		}
		System.out.println("The count number is "+count);
	}

}
