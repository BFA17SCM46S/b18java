package inheritance;

public class Son extends Father {

	@Override
	void playSport() {
		/**
		 * This line will display "Play football" which is in the Father class
		 */
		super.playSport();
		System.out.println("Play cricket");
	}
	public static void main(String[] args) {
		Son son = new Son();
		son.playSport();
	}

}
