
public class MaxOccurChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PAL";
		str=str.toUpperCase();
		if(str.length()>26)System.out.println("String is not unique");
		
		else {
			int pal=0;
			char temp=0;
			char []ch=new char[26];
			for(int i=0;i<str.length();i++) {
				ch[str.charAt(i)-65]++;
				if(ch[str.charAt(i)-65]>temp) {
					temp=str.charAt(i);
				}
			}
			System.out.println(temp);
		}
	}

}
