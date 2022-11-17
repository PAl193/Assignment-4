import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean Anag(char[] a1,char[]a2){
		if(a1.length!=a2.length)return false;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i])return false;
			
			
		}
		return true;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first string for checking Anagram");
		String anagram=sc.next();
		System.out.println("Enter the  second string for checking Anagram");
		String anagram2=sc.next();
		char[]a1=anagram.toCharArray();
		char[]a2=anagram2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Anag(a1,a2));
		
		
		
	}

}
