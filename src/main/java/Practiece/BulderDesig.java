package Practiece;

public class BulderDesig {
	private String name;
	
	public  BulderDesig(String name) {
		this.name=name;
	}
	public BulderDesig getAplication() {
		System.out.println("get Application");
		return this;
	}
	public BulderDesig getFillApplication() {
		System.out.println("fill Aplication");
		return this;
	}
	public BulderDesig submitApplication() {
		System.out.println("submit Application");
		return this;
	}
	public BulderDesig attendCouncil() {
		System.out.println("attend Council");
		return this;
		
	}

}
