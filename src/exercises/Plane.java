package exercises;

import java.util.List;

public class Plane {

	SnakeFactory sF = new SnakeFactory(false);
	private SnakeFactory snakeFactory;

	public int getNumberOfVenomousSnakes() {

		int count = 0;

		List<Snake> snakes = sF.createListOfSnakesWithThatAreRandomlyVenomous();
		for (Snake snake : snakes) {
			if (snake.isVenomous()) {
				count++;
			}
		}
		return count;
	}

	// TODO Auto-generated method stub

	public void addSnakes(List<Snake> snakes) {
		// TODO Auto-generated method stub
		SnakeFactory.createListOfSnakesWithThatAreRandomlyVenomous();
	}

	public SnakeFactory getSnakeFactory() {
		return snakeFactory;
	}

	public void setSnakeFactory(SnakeFactory snakeFactory) {
		this.snakeFactory = snakeFactory;
	}

}
