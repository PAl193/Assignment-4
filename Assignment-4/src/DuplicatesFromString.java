import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string for removal of Duplicates..");
		
		String str=sc.next();
		char []ch=str.toCharArray();
		Arrays.sort(ch);
		int resultSize=1;
		for(int i=1;i<ch.length;i++) {
			if(ch[i]!=ch[i-1]) {
				ch[resultSize]=ch[i];
				resultSize++;
			}
		}
		str=new String(ch);
		System.out.println("The result is...");
		System.out.println(str.substring(0, resultSize));
	}

}
