package ListDemo;
import java.util.Iterator;
import java.util.ArrayList;
public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<String>();
		//colors.add(new object());
		//colors.add(new Double("10.10"));
		
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("yellow");
		
		String str=colors.get(2);
		System.out.println(str);
	}

}
