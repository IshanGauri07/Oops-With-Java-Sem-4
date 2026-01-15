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
	
	Student(String n, int i, String s){
		name = n;
		id = i;
		section = s;
	}
}

public class Third {

	public static void main(String[] args) {
		
	}

}
