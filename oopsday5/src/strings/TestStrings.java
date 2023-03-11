package strings;

public class TestStrings {

	public static void main(String[] args) {
		byte bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="welcome to tommorow land";
		
		bytes =str.getBytes();
		for(byte b:bytes) {
			System.out.println(b);
		}
		char chars[]= {'U','D','P'};
		str= new String(chars);
		System.out.println(str);
		str.getChars(0, chars.length-1, chars, 0);
		

		for(char c:chars) {
			System.out.println(c);
		}
		String str1=new String("She sells sea.shells in sea shore");
		int z=0;
		for(int i=0;i<str1.length();i++) {
			
			if(str1.charAt(i)=='s'||str1.charAt(i)=='S') {
				z=z+1;
				
			}
			
		}
		System.out.println(z);
		
		String words[]=str1.split("[.]");
		System.out.println(words.length);
		
		for(String word:words) {
			System.out.println(word);
		}
		
		String qw=new String("Cartoon");
		System.out.println(qw.startsWith("Car"));
		System.out.println(qw.endsWith("toon"));
		
		int apps=qw.indexOf('a');
		int tpos=qw.indexOf('t');
		
		String jo=qw.substring(apps,tpos);
		jo=qw.substring(tpos);
		System.out.println(jo);
		
		String pq=new String("maddam");
		int dpos=pq.lastIndexOf('d');
		jo=pq.substring(dpos,pq.length());
		System.out.println(jo);
		
		
		String email=new String("joshua.poulose@ust.com");
		int j=email.lastIndexOf('.');
		jo=email.substring(j+1, email.length());
		System.out.println(jo);
		System.out.println(email.toUpperCase());
		System.out.println(email);
		
		

	}
		
	}

