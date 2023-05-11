package NewTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		String s2 = " Tendulkar";
		String s1 = "Sachin";
		String s3 = new String(" Sachin");
		String s4 = " gaurav";
		
		
		 StringBuilder s5 = new StringBuilder("Sachin");
		 StringBuilder s6 = new StringBuilder(" Tendulkar");
		 String s = String.format("%s%s",s1,s2); 
		 String s7 = String.format("%s%s%s",s1,s2,s3);

		 StringJoiner s8= new StringJoiner(" ");
				 s8.add("Sachin");
				 s8.add("tendulkar");
				 
				 
		 List<String> listS= Arrays.asList("scbec", "wjnuwbx","swhv");
		 String str = listS.stream().collect(Collectors.joining(" "));
		// System.out.println(str);
//				 System.out.println(s8);
//				 System.out.println(s8.toString());
		 //System.out.println(String.join("", s1,s2,s3));
		 //System.out.println(s + "\n" + s7);
		//System.out.println(s6.append(s3));
		
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s4.compareTo(s1));
		 
		 
//		SubString
		 
//		 System.out.println(s2.substring(3));
//		 System.out.println(s2.substring(0, 5));
		 
		 
		  String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split(",");  
	        System.out.println(Arrays.toString(sentences));  
	}

}
