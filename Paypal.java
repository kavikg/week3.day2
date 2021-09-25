package week3.day2;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class Paypal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Paypal";
String s1 = s.toLowerCase();
char[] c= s1.toCharArray();

Set<Character> charset = new HashSet<Character>();
Set<Character> dupcharset = new HashSet<Character>();
for(int i=0;i<c.length;i++) {
	Boolean t = charset.add(c[i]);
	if(!t) {
		dupcharset.add(c[i]);
	}
	
}
System.out.println(charset);
System.out.println(dupcharset);
dupcharset.removeAll(charset);
System.out.println(charset);
System.out.println(dupcharset);
for (Character character : charset) {
	if(character!=' ') {
		System.out.println(character);
	}
}
	}

}
