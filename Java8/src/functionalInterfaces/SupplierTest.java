package functionalInterfaces;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
		Supplier<String>supplier=()->{
			return new String("hello");
		};
		System.out.print(supplier.get());

	}

}
