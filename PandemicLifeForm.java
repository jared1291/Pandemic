
import java.awt.Color;

public abstract class PandemicLifeForm {

	protected PandemicWorld myWorld;
	protected PandemicLocation myLocation;
	protected Color myColor;
	protected boolean alive;

	// lifeform constructors
	public PandemicLifeForm(PandemicLocation myLocation, Color myColor, PandemicWorld myWorld) {
		super();
		this.myLocation = myLocation;
		this.myColor = myColor;
		this.myWorld = myWorld;
		alive = true;
	}

	public PandemicLifeForm(PandemicLocation myLocation, PandemicWorld myWorld) {
		super();
		this.myWorld = myWorld;
		this.myLocation = myLocation;
		alive = true;
	}
	
	public abstract void move();

	public boolean isDead() {
		return !alive;
	}

	// getter and setters (aka accessors and mutators)

	public PandemicLocation getMyLocation() {
		return myLocation;
	}

	public void setMyLocation() {
		this.myLocation = myLocation;
	}

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	@Override
	public String toString() {
		return "LifeForm [myLifeSpan=" +  ", myLocation=" + myLocation + ", myColor=" + myColor + "]";
	}
}
