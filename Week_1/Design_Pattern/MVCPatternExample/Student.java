package MVCPatternExample;

public class Student {
	private String name;
	private String id;
	private String grade;
	public Student(String name, String id, String grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		 this.name=name;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id=id;
	}
	public String getgrade() {
		return grade;
	}
	public void setgrade(String grade) {
		this.grade=grade;
	}
	
	

}
