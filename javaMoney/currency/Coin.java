package currency;

public class Coin extends Currency {
	private int sizeInMils;
	private boolean hasRidges = false;
	private String metalType;

	public Coin(float v){
		super(v);
	}

	public void setSize(int s){
		sizeInMils = s;
	}

	public int getSize(){
		return sizeInMils;
	}

	public void hasRidges(){
		hasRidges = true;
	}

	public boolean getRidges(){
		return hasRidges;
	}

	public void setMetal(String m){
		metalType = m;
	}

	public String getMetal(){
		return metalType;
	}
}
