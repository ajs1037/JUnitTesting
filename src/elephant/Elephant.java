package elephant;

public class Elephant {

	int legs;
	int trunk;
	int eyes;
	boolean fly;
	String color;
	
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTrunk() {
		return trunk;
	}

	public void setTrunk(int trunk) {
		this.trunk = trunk;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elephant clyde;
		clyde = new Elephant();
		clyde.setLegs(4);
		System.out.println("Elephant has " + clyde.getLegs()+ " legs");

	}
	
	

}
