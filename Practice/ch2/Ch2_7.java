import java.util.Random;
/**
 *扔硬币实验，使用Random类实现
 */
public class Ch2_7{
	public static void main(String[] args){
		Coin coin=new Coin();
		int front=0;
		int back=0;
		for (int i=0;i<1000 ;i++ ) {
			coin.setStatus();
			if ("front".equals(coin.getStatus())) {
				front++;
			}else{
				back++;
			}
			coin.printStatus();
		}
		System.out.println();
		System.out.println("front count : " + front);
		System.out.println("back count : "+ back);

		//Ch2_8 & Ch2_9
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		int i1=0x555;
		int i2=0xaaa;
		System.out.println(Integer.toBinaryString(i1 & i2));
		System.out.println(Integer.toBinaryString(i1 | i2));

		int i3=1024;
		System.out.println(i3<<3);
	}
}

class Coin{
	private String status = "front";
	public String getStatus(){
		return this.status;
	} 
	public void setStatus(){
		Random random = new Random();
		if (random.nextBoolean()) {
			status="front";
		}else{	
			status="back";
		}
	}
	public void printStatus(){
		System.out.print(status+"-|-");
	}
}