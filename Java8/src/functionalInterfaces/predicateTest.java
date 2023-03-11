package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
		
		Predicate<String> p=(String str)->{
			return str.length()>5;
		};
		//System.out.println(p.test("hello"));
		for(String str:Strings) {
			System.out.println(p.test(str));
		}
		desiredlength(Strings,p);

	}
	public static void desiredlength(List<String>strings,Predicate<String>p) {
		for(String str:strings) {
			System.out.println(p.test(str));
		}
	}

}
