package NewTest;

public class StringBuilderTest {
	public static void main(String[] args) {
		
	
	
	String s1= " i am Nikhil";
//	String rev = new StringBuffer(s1).reverse().toString();
//	
//	System.out.println(rev);
	
	String[] str= s1.split(" ");
	
	String temp;
	
	for (int i=0; i<(str.length/2); i++) {
		temp=str[i];
		str[i]=str[str.length-1-i];
		str[str.length-1-i]=temp;
		
	}
	String rev1=String.join(" ", str);
	System.out.println(rev1);
	}
			

}
