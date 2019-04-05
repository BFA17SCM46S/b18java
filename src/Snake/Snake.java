package Snake;

public class Snake {
	
	/**
	 * Snake will move at the given speed
	 * @param speed
	 */
	public void move(int speed) {}
	
	/**
	 * Snake will turn in the given direction
	 * 1 = east, 2 = west, 3 = north, 4 = south
	 * @param direction
	 */
	public void turn(int direction) {}
	
	/**
	 * Snake eats the food and grows
	 */
	public void eat() {}
	
	/**
	 * Snake pause when app is being navigated away
	 */
	public void pause() {}
	
	/**
	 * Die when hit a wall
	 */
	public void die() {}
	
	/**
	 * Snake's length increases by one tile
	 */
	public void grow() {}
	
	/**
	 * Shrink when it bites itself
	 */
	public void shrink() {}
}
