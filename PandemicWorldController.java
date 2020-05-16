
import java.awt.Color;
import acm.graphics.*;
import acm.program.*;


public class PandemicWorldController extends GraphicsProgram {

	private PandemicWorld theWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;

	public void run() {
		setUpWorld();
		runWorld();
	}

	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new PandemicWorld(100, 100);

		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(1, 1), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 26), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(10, 4), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 54), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(43, 27), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(89, 77), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(18, 76), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(23, 23), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(6, 7), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(92, 3), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 69), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(77, 12), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(10, 4), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 45), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(43, 22), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(5, 8), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(61, 6), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(2, 12), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(33, 56), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(24, 54), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(9, 6), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(9, 5), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(6, 16), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(5, 16), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 43), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(65, 44), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 67), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 66), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(41, 67), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(41, 66), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(54, 60), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(54, 59), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(13, 13), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(13, 12), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(80, 78), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(80, 79), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(11, 76), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(11, 75), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(15, 25), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(14, 25), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(72, 47), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(72, 49), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(78, 52), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(78, 54), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(22, 47), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(22, 49), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(67, 12), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(67, 14), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(20, 50), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(20, 49), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 87), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(40, 85), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 72), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(60, 73), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(95, 11), theWorld));
		theWorld.getCreatureList().add(new PandemicCreature(new PandemicLocation(94, 15), theWorld));

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
