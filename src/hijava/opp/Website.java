package hijava.opp;

public class Website extends SoftWare{
	
	@Override
	public void plan() {
		System.out.println("Site 기획");
	}
	
	@Override	
	public void develope() {
		System.out.println("Site 개발");
	}
	
	public void release() {
		System.out.println("Site 출시");
	}
}
