package ProxyPatternExample;

public class RealImage implements Image {
	private String imgurl;
	RealImage(String imgurl) {
		this.imgurl=imgurl;
		loadfromserver();
		
	}
	public void loadfromserver() {
		System.out.println("Loading image from "+imgurl);
	}
	@Override
	public void display() {
		System.out.println("Displaying image "+imgurl);
		
	}
	

}
