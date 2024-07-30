package ProxyPatternExample;

public class ProxyImage implements Image {
	private String imgurl;
	private RealImage ri;
	public ProxyImage(String imgurl) {
		this.imgurl=imgurl;
	}
	public void display() {
		if(ri==null) {
			ri=new RealImage(imgurl);
		}
		ri.display();
	}

}
