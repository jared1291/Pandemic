
import java.util.ArrayList;

public class PandemicWorld {

	private int width;
	private int height;
	private ArrayList<PandemicLifeForm> creatureList;

	public PandemicWorld(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.creatureList = new ArrayList<PandemicLifeForm>();
	}

	public void letTimePass() {
		changeLocation();
	}

	public void changeLocation() {
		int currentSizeOfCreatureList = creatureList.size();

		System.out.println("(move) size of list is " + currentSizeOfCreatureList);
		for (int i = 0; i < currentSizeOfCreatureList; i++) {
			creatureList.get(i).move();
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<PandemicLifeForm> getCreatureList() {
		return creatureList;
	}

	public void setCreatureList(ArrayList<PandemicLifeForm> creatureList) {
		this.creatureList = creatureList;
	}

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height + ", creatureList=" + creatureList + "]";
	}
}
