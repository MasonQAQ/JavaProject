public class Ch1_8{
	public static void main(String[] args){
		Test test1=new Test();
		Test test2=new Test();
		System.out.println(test1.i + "==" + test2.i);

		Test.i++;
		System.out.println(test1.i + "==" + test2.i);
	}
}

class Test{

	public static int i=99;
	public Test(){
		//构造器
	}
}