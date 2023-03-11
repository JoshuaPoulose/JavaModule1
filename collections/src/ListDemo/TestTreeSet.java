package ListDemo;
import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>bookSet=new TreeSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in java");
		bookSet.add("java in 21 days");
		bookSet.add("Java for dummys");
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		for(String book: bookSet) {
			System.out.println(book);
		}
		
		Iterator<String>iter=bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
