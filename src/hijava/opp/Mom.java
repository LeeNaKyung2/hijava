package hijava.opp;

public class Mom {
	private String name;
	
	public Mom(String name) {
		this.name = name;
	}
	
	public Mom() {
		this("엄마");
	}
	
	public void drinkBeer() {
		System.out.println("Dirnking Beer!!");
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		System.out.println("EAT!!");
	}
	
	public void say() {
		System.out.println("Mom said...");
	}
}

