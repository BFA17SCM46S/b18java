package Student;

public class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void insertRecord(int r, String n) {
		rollNo = r;
		name = n;
		int a = 10;
		int b = 20;
		int c = a + b;
	}

	public void displayRecord() {
		System.out.println("name ="+name + "\nid =" +rollNo);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(007, "bonds");
//		s1.insertRecord(007, "bond");
		s1.displayRecord();
	}

}
