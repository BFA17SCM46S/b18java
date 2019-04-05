package finalKeyword;

public class finalVariable {
	
	final int number = 5;
	void showNumber() {
		/**
		 * Cannot set another value to number because it is declared final
		 */
		//number = 100;
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		finalVariable finalVariable = new finalVariable();
		finalVariable.showNumber();
	}

}
