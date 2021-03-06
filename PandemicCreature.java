
import java.awt.Color;
import acm.util.RandomGenerator;

public class PandemicCreature extends PandemicLifeForm {

	private int currentSizeOfCreatureList = myWorld.getCreatureList().size() + 1;
	RandomGenerator rgen = new RandomGenerator();

	public PandemicCreature(PandemicLocation myLocation, Color myColor, PandemicWorld myWorld) {
		super(myLocation, myColor, myWorld);
	}


	public void move() {

		for (int creature = 0; creature < currentSizeOfCreatureList; creature++) {
			if (myWorld.getCreatureList().get(creature).getMyColor() == Color.orange || myWorld.getCreatureList().get(creature).getMyColor() == Color.magenta) {

				int currX = myWorld.getCreatureList().get(creature).getMyLocation().getX();
				int currY = myWorld.getCreatureList().get(creature).getMyLocation().getY();

				// Allows movement of up to 3 steps forward or backward
//				int stepsX = (int) (Math.random() * 2) - 1;
//				int stepsY = (int) (Math.random() * 2) - 1;
				int stepsX = rgen.nextInt(-3, 3);
				int stepsY = rgen.nextInt(-3, 3);

				currX += stepsX;
				currY += stepsY;

				if (0 <= currX && currX <= 100 && 0 <= currY && currY <= 100) {
					myWorld.getCreatureList().get(creature).myLocation.setX(currX);
					myWorld.getCreatureList().get(creature).myLocation.setY(currY);
				}
			}
		}
	}

}
