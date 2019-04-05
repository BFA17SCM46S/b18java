package inheritance;

public class Son extends Father {

	@Override
	void playSport() {
		super.playSport();
		System.out.println("Play cricket");
	}
	public static void main(String[] args) {
		Son son = new Son();
		son.playSport();
	}

}
