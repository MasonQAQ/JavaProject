public class Ch2_6{

	public static void main(String[] args){

		Dog dog1=new Dog("dog1","wangwang");
		Dog dog2=new Dog("dog2","miaomiao");
		Dog dog3=new Dog("dog1","wangwang");

		System.out.println(dog1.equals(dog2)); 
		System.out.println(dog1.equals(dog3)); 
	}

}


class Dog{
	public String name;
	public String says;
	public Dog(String name,String says){
		this.name=name;
		this.says=says;
	}	
	public void bark(){
		System.out.println(this.name+" : "+this.says);
	}
	public boolean equals(Dog dog){
		if(this.name.equals(dog.name)&&this.says.equals(dog.says)){
			return true;
		}else{
			return false;
		}
	}
}