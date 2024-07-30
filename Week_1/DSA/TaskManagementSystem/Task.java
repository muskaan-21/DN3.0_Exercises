package TaskManagementSystem;

public class Task {
	private int taskId;
	private String taskName;
	private String status;
	public Task(int taskId,String taskName,String status) {
		this.taskId=taskId;
		this.taskName=taskName;
		this.status=status;
	}
	public int gettaskid() {
		return taskId;
	}
	public String gettaskname() {
		return taskName;
	}
	public String gettaskstatus() {
		return status;
	}
	public String toString() {
		return "Task {"+"taskid: "+taskId+", taskname: "+taskName+", statsu : "+status+ '}';
	}
	

}
