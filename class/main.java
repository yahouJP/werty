//package class

public class main{
	public static void main(String args[]){

		Hero yojik = new Hero("Yojik",(byte)34,true);

		yojik.introduseYourSelf();
		yojik.getName();
		yojik.getAge();
		yojik.getImmortalityCheat();
		yojik.getQuest();
		yojik.setQuest("New quest");
		yojik.getQuest();

		System.out.println("--------------------------------------------------------------------");

		HeroSword paladin = new HeroSword("Paladin", 666, 100);

		paladin.getNameSword();
		paladin.getDamage();
		paladin.getRobustness();
		paladin.mending(200);
		paladin.getRobustness();

		System.out.println("--------------------------------------------------------------------");

		HeroArmor armor = new HeroArmor("Armor", 999, "China");

		armor.getNameArmor();
		armor.getDefense();
		armor.getMadeIn();
		armor.setMadeIn("Japan");
		armor.getMadeIn();
		
	}
}
