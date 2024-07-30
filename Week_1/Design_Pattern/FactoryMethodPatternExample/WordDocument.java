package FactoryMethodPatternExample;

public class WordDocument implements Document {
	public void open() {
		System.out.println("opening the word document");
	}
	public void close() {
		System.out.println("closing the word document");
	}
	
}
