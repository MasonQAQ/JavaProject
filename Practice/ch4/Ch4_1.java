public class Ch4_1{
	public static void main(String[] args){
		new Print(25).printAll();
	}
}

class Print{
	private static int max=0;
	public Print(int max){
		this.max=max;
	}
	public void setMax(int max){
		this.max=max;
	}
	public static void printAll(){
		for (int i=0;i<max ;i++ ) {
			System.out.print(i+"\t");
		}
	}
}