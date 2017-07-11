import java.util.Scanner;
import vehicle.*;

public class Driving {
	public static void main(String[] argv){

		Car car = new Car();
		Scanner kb = new Scanner(System.in);
		int menuOption = 0;

		car.setRunning(true);

		while(car.getRunning()){
			System.out.println("Car is running, what do you want to do?");
			System.out.println("0 - Turn off the car");

			menuOption = kb.nextInt();

			if(menuOption == 0) {
				car.setRunning(false);
			}
		}

		System.out.println("Car is off... goodbye!");
	}
}
