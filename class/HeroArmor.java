//package class

public class HeroArmor{

	HeroArmor(String nameArmor, int defense, String madeIn){

		this.nameArmor = nameArmor;
		this.defense = defense;
		this.madeIn = madeIn;

	}

	private String nameArmor;
	private int defense;
	private String madeIn;

	//Gettory

	public void getNameArmor(){
		System.out.println("Name Armor: "+this.nameArmor);
	}

	public void getDefense(){
		System.out.println("Defense Armor: "+this.defense);
	}

	public void getMadeIn(){
		System.out.println("This armor is made in "+this.madeIn);
	}

	//Settor

	public void setMadeIn(String newMadeIn){
		this.madeIn=newMadeIn;
	}

	
}
