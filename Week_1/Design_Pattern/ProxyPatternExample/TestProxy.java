package ProxyPatternExample;

public class TestProxy {

	public static void main(String[] args) {
		Image i1=new ProxyImage("http://example.com/image1.jpg");
		i1.display();//image with load from server
		System.out.println("");
		
		i1.display();//will not be loaded from server
		System.out.println("");
	}

}
