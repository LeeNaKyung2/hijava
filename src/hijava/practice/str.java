package hijava.practice;

public class str {

	public static void main(String[] args) {
		char c='한'; //11
		byte b='B';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println(b);
		
		String str="AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB��".getBytes().length);

	}

}
