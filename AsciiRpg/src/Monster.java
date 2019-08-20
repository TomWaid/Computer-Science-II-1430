
public class Monster extends Actor  {

	Monster(String name, int hp, char symbol, int x, int y) {
		super(name, hp, symbol, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	int generateRandomAttack() {
		return (int) (Math.random()*5)+17;
	}
	
	void move(int maxX, int maxY)
	{
		int d=(int) (Math.random()*4);
		switch(d)
		{
		//Up
		case 0:if(this.getY()-1>=0)
					this.setY(this.getY()-1);
			break;
		//Left
		case 1:if(this.getX()-1>=0)
			this.setX(this.getX()-1);
			break;
		//Down
		case 2:if(this.getY()+1<maxY)
			this.setY(this.getY()+1);
			break;
		//Right
		case 3:if(this.getX()+1<maxX)
			this.setX(this.getX()+1);
			break;
		default:
			break;
			
		}
	}

}
