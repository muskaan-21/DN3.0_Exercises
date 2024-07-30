package MVCPatternExample;

public class TestMVC {

	public static void main(String[] args) {
		Student s1=new Student("Vidya","1001","A");
		StudentView v=new StudentView();
		StudentController sc=new StudentController(s1,v);
		sc.updateview();
		sc.setstname("Mohant");
		sc.setstgrade("B");
		sc.updateview();
		
		
	}

}
