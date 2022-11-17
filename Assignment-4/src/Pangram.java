import java.util.Iterator;

public class Pangram {
	public static String pangram(String pangram) {
		pangram=pangram.replace(" ", "");
		System.out.println(pangram);
		pangram=pangram.toUpperCase();
		int[] ch=new int[26];
		char[] cha=pangram.toCharArray();
		 
		for(int i=0;i<pangram.length();i++) {
			int index=cha[i]-65;
			ch[index]++;
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==0) {
				return "String is Not A pangram";
			}
		}
		
		return "String is A Pangram";
		
		
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pangram="The quick brown fox jumps over the lazy dog";
		
		System.out.println(pangram(pangram));
		
	}

}
