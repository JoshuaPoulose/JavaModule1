package ListDemo;
import java.util.ArrayDeque;
import java.util.Iterator;
public class TestArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<String> q = new ArrayDeque<>();
		q.addLast("first");
		q.addLast("second");
		q.addLast("third");
		q.addLast("fourth");
		q.addLast("fifth");
		System.out.println(q);
		System.out.println(q.size());
		
		String element =q.peek();//getFirst();
		System.out.println(element);
		q.poll();
		System.out.println(q);
		
		Iterator<String>iter=q.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	}
}

