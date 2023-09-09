package game;

public class Shooter {
	
	public static void main(String[] args) {
		Player1 player=new Player1("Sakshi" ,"sword",90);
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());
		
		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
		
		System.out.println("*****************************************************************************");
		
		Player2 betterplayer = new Player2("Sam", "machine gun",80,false);
		betterplayer.damageByGun1();
		betterplayer.heal();
		
	}

}
