package finalKeyword;

/**
 * final class cannot be extended
 *
 */
//final class randomClass{}

public class finalClass extends randomClass {
	void run() {
		System.out.println("Downloading....");
	}
	public static void main(String[] args) {
		finalClass finalClass = new finalClass();
		finalClass.run();
	}
}
