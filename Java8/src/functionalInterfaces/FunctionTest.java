package functionalInterfaces;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
		
		
		Function<String,Integer> f=(str)->{
			return str.length();
		};
		printLength(strings,f);
		
		Function <String,String> s=(str1)->{
			return str1.toUpperCase();
			};
			uppercase(strings,s);
			
		Function<String,String> J=(str2)->{
			return str2.toLowerCase();
		};
			lowercase(strings,J);
			
	}
		private static void printLength(List<String> strings,Function<String, Integer> f) {
		for(String str: strings) {
			System.out.println(f.apply(str));
			}
		}
		public static void uppercase(List<String> strings,Function<String,String> up) {
			for(String str1: strings){
				System.out.println(up.apply(str1));
				}
		}
		public static void lowercase(List<String> strings,Function<String,String> low) {
			for(String str2: strings){
				System.out.println(low.apply(str2));
				}
		}

	

}
