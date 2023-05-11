package NewTest;

public class StringBufferTest {

	


	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Sachin");
		StringBuffer sb1=new StringBuffer("hellow");  
		
		System.out.println(sb.append("te"));
		System.out.println(sb.insert(1, "aa"));
		System.out.println(sb.replace(0, 7, "Java"));
		System.out.println(sb.delete(1, 2));
		System.out.println(sb.deleteCharAt(2));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.codePointCount(1, 3));
		System.out.println(sb.hashCode());


		
		
		
		
		
		
	}
}
