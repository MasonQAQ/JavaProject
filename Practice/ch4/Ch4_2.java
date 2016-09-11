import java.util.*;

public class Ch4_2{
	public static void main(String[] args){
		Random random=new Random();
		ArrayList listUp = new ArrayList();
		ArrayList listDown = new ArrayList();
		ArrayList listEqual = new ArrayList();
		for (int i=0;i<25 ;i++ ) {
			int tem=random.nextInt();
			int temNext=random.nextInt();
			if(tem<temNext){
				listDown.add(tem);
			}else if(tem>temNext){
				listUp.add(tem);
			}else{
				listEqual.add(tem);
			};
		}
		System.out.println(listUp.toString());
		System.out.println(listDown.toString());
		System.out.println(listEqual.toString());
	}
}