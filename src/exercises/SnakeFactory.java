package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeFactory extends Snake {

	public SnakeFactory(boolean venomous) {
		super(venomous);
		// TODO Auto-generated constructor stub
	}

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {
		// TODO Auto-generated method stub
		boolean venomous = new Random().nextBoolean();
		List<Snake> snakes = new ArrayList<Snake>();
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(venomous));
			venomous = new Random().nextBoolean();
		}

		return snakes;
	}

}
