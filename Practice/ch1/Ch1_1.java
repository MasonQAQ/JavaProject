public class Ch1_1{
	public static void main(String[] args){
		Test test=new Test();
		test.getAB();
	}
}

/*
 *测试类，测试ab是否被初始化
 */
class Test{
	private char a;
	private int b;
	public void getAB(){
		System.out.println("char a = [" + a + "]");
		System.out.println("int b= " + b);
	}
}