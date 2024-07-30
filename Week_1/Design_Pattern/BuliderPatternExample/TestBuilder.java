package BuliderPatternExample;

import BuliderPatternExample.Computer.Builder;

public class TestBuilder {

	public static void main(String[] args) {
		Computer game=new Computer.Builder().setcpu("intel core i5").setram("64GB").setstorage("1TB ssd").build();
		 System.out.println(game);

	}

}
