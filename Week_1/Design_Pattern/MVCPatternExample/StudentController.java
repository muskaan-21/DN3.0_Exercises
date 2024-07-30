package MVCPatternExample;

public class StudentController {
	private Student model;
	private StudentView view;
	public StudentController(Student model, StudentView view) {
		this.model=model;
		this.view=view;
	}
	public void setstname(String name) {
		model.setname(name);
	}
	public String getstname() {
		return model.getname();
	}
	public void setstid(String id) {
		model.setid(id);
	}
	public String getstid() {
		return model.getid();
	}
	public void setstgrade(String grade) {
		model.setgrade(grade);
	}
	public String getstgrade() {
		return model.getgrade();
	}
	public void updateview() {
		view.displayStudentDetails(model.getname(),model.getid(),model.getgrade());
	}

}
