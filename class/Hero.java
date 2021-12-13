//package class

public class Hero{

	Hero(String name, byte age, boolean immortalityCheat){

		this.name = name;
		this.age = age;
		this.immortalityCheat = immortalityCheat;

		System.out.println("Hero "+this.name+". Was called.");

	}

	private String name;
	private byte age;
	private String quest = "No quests";
	private boolean immortalityCheat;

	public void introduseYourSelf(){
		System.out.println("Hello I`m is hero. My name is "+this.name+". I`m "+this.age+" years old");
	}

	//Gettory

	public void getName(){
		System.out.println("Name: "+this.name);
	}

	public void getAge(){
		System.out.println("Age: "+this.age);
	}

	public void getImmortalityCheat(){
		if(this.immortalityCheat){
			System.out.println(this.name+" is immortal!");
		}else{
			System.out.println(this.name+" is not immortal!");
		}
	}


	public void getQuest(){
		System.out.println(this.quest);
	}

	//Settor

	public void setQuest(String newQuest){
		this.quest=newQuest;
	}
}
