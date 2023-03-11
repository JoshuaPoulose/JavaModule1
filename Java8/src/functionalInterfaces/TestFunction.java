package functionalInterfaces;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class TestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
		
		
		Function<String,Integer> f=(str)->{
			return str.length();
		};
		for(String str: Strings) {
			System.out.println(f.apply(str));
		}
		//System.out.println(f.apply("good boyrr"));
		
		Function<Integer,Integer> f2=(n)->{
			return n*n;
		};
		System.out.println(f2.apply(25));
		
		Function<String,String> f3=(str)->{
			return str.toUpperCase();
		};
		System.out.println(f3.apply("house"));
	}
	

}
