//package class

public class HeroSword{

	HeroSword(String nameSword, int damage, int robustness){

		this.nameSword = nameSword;
		this.damage = damage;
		this.robustness = robustness;

	}

	private String nameSword;
	private int damage, robustness;

	public void mending(int repair){
		this.robustness += repair;
	}

	//Gettory

	public void getNameSword(){
		System.out.println("Name Sword: "+this.nameSword);
	}

	public void getDamage(){
		System.out.println("Damage Sword: "+this.damage);
	}

	public void getRobustness(){
		System.out.println("Robustness: "+this.robustness);
	}

	
}
