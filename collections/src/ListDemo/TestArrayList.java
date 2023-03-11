package ListDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList flowers = new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		flowers.add("tulips");
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("cosmos");
		
		//String str=(String)flowers.get(2);
		
		System.out.println(flowers);
		System.out.println(flowers.size());
		System.out.println(flowers.get(2));
		System.out.println(flowers.contains("lilly"));
		flowers.add(2, "sunflower");
		for(Object obj : flowers) {
			System.out.println(obj);
		}
		
		flowers.remove(2);
		System.out.println(flowers);
		
		Iterator iter = flowers.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(int i=0;i<flowers.size();i++) {
			System.out.println(flowers.get(i));
		}
	}

}
