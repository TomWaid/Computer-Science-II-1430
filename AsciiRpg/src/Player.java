
public class Player extends Actor{

	Player(String name, int hp, char symbol, int x, int y) {
		super(name, hp, symbol, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	int generateRandomAttack() {
		return (int) (Math.random()*5)+30;
	}
	
	void move(char d, int maxX, int maxY)
	{
		switch(d)
		{
		//Up
		case 'w':if(this.getY()-1>=0)
					this.setY(this.getY()-1);
			break;
		//Left
		case 'a':if(this.getX()-1>=0)
			this.setX(this.getX()-1);
			break;
		//Down
		case 's':if(this.getY()+1<maxY)
			this.setY(this.getY()+1);
			break;
		//Right
		case 'd':if(this.getX()+1<maxX)
			this.setX(this.getX()+1);
			break;
		//Stay
		case 'e':
			break;
		case 'q':
			System.exit(0);
			break;
		default: System.out.println("Invalid Input!");
			break;
			
		}
	}

}
