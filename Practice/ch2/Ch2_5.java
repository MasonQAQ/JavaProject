public class Ch2_5{
	public static void main(String[] args){
		Dog dog1=new Dog("Ruff");
		Dog dog2=new Dog("Wuff");

		dog1.bark("Ruff!");
		System.out.println("---------------------------");
		dog2.bark("Wuff!");
	}
}

class Dog{
	public String name;
	public Dog(){

	}
	public Dog(String name){
		this.name=name;
	}
	public void bark(String voice){
		System.out.println("my name is " + name);
		System.out.println("my voice is " + voice);
	}
}