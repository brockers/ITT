package currency;

public class Bill extends Currency {
	private String president;

	public Bill(float v){
		super(v);
	}

	public void setPresident(String p){
		president = p;
	}

	public String getPresident(){
		return president;
	}
}
