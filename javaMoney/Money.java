import currency.*;

public class Money{
	public static void main(String[] argv){
		Bill b = new Bill(1.0f);
		Coin c = new Coin(0.1f);

		b.setPresident("Washington");
		c.setSize(22);
		c.setMetal("Copper");

		System.out.println("Created one of each.");

		float bvalue = b.getFaceValue();
		float cvalue = c.getFaceValue();

		System.out.println("Our coin is a " + c.getMetal() + " that is " + String.valueOf(c.getSize()) + " millimeters wide." );
		System.out.println("Face value of our coin is " + String.valueOf(cvalue));
		System.out.println("Our bill has president " + b.getPresident() + " on it.")
		System.out.println("Face value of our bill is " + String.valueOf(bvalue));
	}
}
