package TaskManagementSystem;

public class taskmanagementsystem {
	private class Node{
		Task task;
		Node next;
		Node(Task task){
			this.task=task;
			this.next=null;
		}
	}
	private Node head;
	public taskmanagementsystem() {
		this.head=null;
	}
	public void add(Task task) {
		Node newnode=new Node(task);
		if(head==null) {
			head=newnode;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newnode;
		}
	}
	public Task search(int taskId) {
		Node current=head;
		while(current!=null) {
			if(current.task.gettaskid()==taskId) {
				return current.task;
			}
			current=current.next;
		}
		return null;
	}
	public void traverse() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.task);
			current=current.next;
		}
	}
	public void delete(int taskId) {
		if(head==null) {
			return;
		}
		if(head.task.gettaskid()==taskId) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.task.gettaskid()!=taskId) {
			current=current.next;
		}
		if(current.next!=null) {
			current.next=current.next.next;
		}
	}

	public static void main(String[] args) {
		taskmanagementsystem system=new taskmanagementsystem();
		
		system.add(new Task(1,"Data structure","Inprogress"));
		system.add(new Task(2,"Design pattern","Completed"));
		system.add(new Task(3,"Testing","Done"));
		system.add(new Task(4,"calculation","wrong implemented"));
		
		System.out.println("All tasks");
		system.traverse();
		
		System.out.println("Search for task Id 2");
		System.out.println(system.search(2));
		
		System.out.println("Deleting task ID 4");
		system.delete(4);
		
		System.out.println("After deletion: ");
		system.traverse();
		

	}

}
