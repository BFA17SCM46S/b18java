package finalKeyword;

class randomClass {
	final void showNumber() {
		System.out.println("100");
	}
}

class finalMethod extends randomClass {
	
	/**
	 * showNumber cannot override showNumber in randomClass
	 */
//	void showNumber() {
//		System.out.println("300");
//	}
	
	public static void main(String[] args) {
		finalMethod finalMethod = new finalMethod();
		finalMethod.showNumber();
	}
}

