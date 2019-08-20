/*
 * Group Assignment 4
 * Tommy Waid - 100%
 * Thomas Ochoa - 100%
 * Randy Nguyen - 100%
 * */
import java.util.*;
public class main {
	
	public static void main(String[] args)
	{ //i is y and x is j grid[y][x]
		
		int maxX=9;
		int maxY=9;
		
		char[][] grid = new char[maxY][maxX];
		for(int i=0;i<maxY;i++)
			for(int j=0;j<maxX;j++)
				grid[i][j]='-';
		
		Player player=new Player("Link",50,'P',4,4);
		Monster monster=new Monster("Ganon",50,'M',2,7);
		grid[player.getY()][player.getX()]=player.getSymbol();
		grid[monster.getY()][monster.getX()]=monster.getSymbol();
		
		boolean running=true;
		boolean fighting=false;
		boolean playerAttack=true;
		char move=' ';
		int atkDmg;
		Scanner reader = new Scanner(System.in);
		
		while(running)
		{
			
			//Grid Draw
			for(int i=0;i<maxY;i++){
				for(int j=0;j<maxX;j++)
				System.out.print(grid[i][j]+" ");
				System.out.println();
				}
			//Ask for user movement
			System.out.println("up: w | down: s | left: a | right: d | quit: q ");
			System.out.print("move: ");
			move=  reader.next(".").charAt(0);
			grid[player.getY()][player.getX()]='-';
			player.move(move, maxX, maxY);
			grid[player.getY()][player.getX()]=player.getSymbol();
			//Check quit
			if(move=='q')
				running=false;
			
			//Check if fighting and init combat if necessary
			if(monster.getX()==player.getX()&&monster.getY()==player.getY())
			{
				fighting=true;
				System.out.println(player.getName()+" encounters "+monster.getName()+"!");
				System.out.println(player.getName()+" HP: "+player.getHP()+ " | "+ monster.getName()+" HP: "+monster.getHP());
			}
				
			
			//Fight sequence
			while(fighting&&running)
			{
				if(playerAttack)
				{
					atkDmg=player.generateRandomAttack();
					System.out.println(player.getName()+ " attacks with "+atkDmg);
					monster.setHP(monster.getHP()-atkDmg);
					System.out.println(monster.getName()+" HP: "+monster.getHP());
				}
				else{
					atkDmg=monster.generateRandomAttack();
					System.out.println(monster.getName()+ " attacks with "+atkDmg);
					player.setHP(player.getHP()-atkDmg);
					System.out.println(player.getName()+" HP: "+player.getHP());
				}
				//End Condition
				if(player.getHP()<=0||monster.getHP()<=0)
					fighting=false;
				playerAttack=!playerAttack;
				
				
			}
			
			//Check end conditions(player||monster dead)
			if(player.getHP()<=0)
			{
				running=false;
				System.out.println("\nCombat is over!\n"+player.getName()+" is defeated!");
			}
			else if(monster.getHP()<=0)
			{
				running=false;
				System.out.println("\nCombat is over!\n"+monster.getName()+" is defeated!");
			}
			
			//Move Monster
			grid[monster.getY()][monster.getX()]='-';
			monster.move(maxX,maxY);
			grid[monster.getY()][monster.getX()]=monster.getSymbol();
			
			System.out.println();
		}
				
		
	}

}


