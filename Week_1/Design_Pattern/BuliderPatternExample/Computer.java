package BuliderPatternExample;

public class Computer {
	private String cpu;
	private String ram;
	private String storage;
	//constructor
	private Computer(Builder builder) {
		this.cpu=builder.cpu;
		this.ram=builder.ram;
		this.storage=builder.storage;
		
	}
	public String toString() {
		return "Computer [CPU= "+cpu + "\n RAM= "+ram+"\n Storage= "+storage+"]";
		
	}
	//nested builder class
	public static class Builder{
		private String cpu;
		private String ram;
		private String storage;
		
		public Builder setcpu(String cpu) {
			this.cpu=cpu;
			return this;
		}
		public Builder setram(String ram) {
			this.ram=ram;
			return this;
		}
		public Builder setstorage(String storage) {
			this.storage=storage;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
}
