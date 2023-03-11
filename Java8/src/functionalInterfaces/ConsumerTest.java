package functionalInterfaces;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
		Consumer<String>consumer=(str)->{
			System.out.println(str);
		};
		consumer.accept("goood");
		
		for(String str:Strings) {
			consumer.accept(str);
		}
		printStrings(Strings,consumer);
	}
	public static void printStrings(List<String>strings,Consumer<String>c) {
		for(String str: strings) {
			c.accept(str);
		}
	}

}
