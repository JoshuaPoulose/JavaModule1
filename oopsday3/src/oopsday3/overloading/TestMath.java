package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math obj=new Math();
		int result=obj.add(10,20);
		System.out.println(result);
		
		result=obj.add(10, 20,30);
		System.out.println(result);
		
		double result1=obj.add(10.25,20.25);
		System.out.println(result1);
		
		double result2=obj.add(10.25,20.25,30.50);
		System.out.println(result2);
		
		result2=obj.add(10L, 20L,30L);
		System.out.println("Long "+ result2);
		
		result2=obj.add(10f, 20f,30f);
		System.out.println("Float "+result2);

	}

}
