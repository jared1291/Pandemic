
import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;


public class PandemicWorldController extends GraphicsProgram {

	private PandemicWorld theWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	RandomGenerator rgen = new RandomGenerator();

	public void run() {
		setUpWorld();
		runWorld();
	}

	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new PandemicWorld(100, 100);
		
//		for (int i = 0; i < 100; i++) {
//		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(rgen.nextInt(1, 100), rgen.nextInt(1,100)), Color.orange, theWorld));
//	}
		
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(1, 1), Color.magenta, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 26), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(10, 4), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 54), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(43, 27), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(89, 77), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(18, 76), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(23, 23), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(6, 7), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(92, 3), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 69), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(77, 12), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(10, 4), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 45), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(43, 22), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(5, 8), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(61, 6), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 12), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(33, 56), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(24, 54), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(9, 6), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(9, 5), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(6, 16), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(5, 16), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 43), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 44), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 67), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 66), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(41, 67), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(41, 66), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(54, 60), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(54, 59), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(13, 13), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(13, 12), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(80, 78), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(80, 79), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(11, 76), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(11, 75), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(15, 25), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(14, 25), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(72, 47), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(72, 49), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(78, 52), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(78, 54), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(22, 47), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(22, 49), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(67, 12), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(67, 14), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(20, 50), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(20, 49), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 87), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 85), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 72), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 73), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(95, 11), Color.orange, theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(94, 15), Color.orange, theWorld));

		theWorldCanvas = this.getGCanvas();
	}

	public void runWorld() {
		drawWorld();
		for (int i = 0; i < 5; i++) {
			theWorld.letTimePass();
			pause(500);
			drawWorld();
		}
	}

	public void drawWorld() {
		drawBlankWorld();
		drawCreatures();
	}

	public void drawBlankWorld() {
		for (int row = 0; row < theWorld.getWidth(); row++)
			for (int col = 0; col < theWorld.getHeight(); col++) {
				GRect r = new GRect(row * 10, col * 10, 10, 10);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}

	public void drawCreatures() {
		for (PandemicLifeForm x : theWorld.getCreatureList()) {
			GRect r = new GRect(x.getMyLocation().getX() * 10, x.getMyLocation().getY() * 10, 10, 10);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
	}
}
