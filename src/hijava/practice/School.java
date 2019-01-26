package hijava.practice;

public class School {

	public static void main(String[] args) {
		Score korean = new Score(); //new 뒤는 생성자 만드는거
		korean.setSubject("국어");
		korean.setScore(90);
		
		Score math = new Score("수학",80);
		
		Score science = new Score("과학");
		
		
		//String k = korean.toString();
		System.out.println(korean);
		System.out.println(math);
		System.out.println(science);
		

	}
}
