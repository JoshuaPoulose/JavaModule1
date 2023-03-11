package Testlambdas;

public interface TestInterface {
	public double method();
	public default void method1() {
		System.out.println("from method");
	}
	public static void method2(){
		System.out.println("from static method");
	}

}
