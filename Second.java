package ishan;

class Student{
	String name;
	int id;
	String section;
	
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.section);
	}
	
	Student(){
		System.out.println("Constructor called");
	}
}

public class Second {

	public static void main(String[] args) {
		Student S1=new Student();
		S1.name="Ankit";
		S1.id=1;
		S1.section="E";
		S1.printinfo();
		Student S2 = new Student();
		S2.name = "Ishan";
		S2.id = 2;
		S2.section = "E";
	//	System.out.println(S2.name);
	//	System.out.println(S2.id);
	//	System.out.println(S2.section);
		S2.printinfo();
	}

}
