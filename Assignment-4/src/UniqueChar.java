
public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PALPatel";
		str=str.toUpperCase();
		if(str.length()>26)System.out.println("String is not unique");
		
		else {
			int pal=0;
			char []ch=new char[26];
			for(int i=0;i<str.length();i++) {
				ch[str.charAt(i)-65]++;
				if(ch[str.charAt(i)-65]>1) {
					System.out.println("String is not unique");
					pal=1;
					break;
				}
			}
			if(pal==0) {
				System.out.println("String is a unique");
			}
		}
	}

}
