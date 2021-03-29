import java.util.*;
public class ProccessAName5026201037 {
	public static void main(String[] args) {
	Scanner HuTao = new Scanner (System.in);
	System.out.println("Type your name (use underscore) : ");
	
	String Complete = HuTao.next();


int idx = Complete.indexOf('_');
String last = Complete.substring(idx+1);
System.out.println("Your name is : " + last  +", " + Complete.charAt(0) );
System.out.println(idx);
	}
}