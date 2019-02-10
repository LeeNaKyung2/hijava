package hijava.opp;

public class Scanner {

	public static void main(String[] args) {
		scanner();

	}

	private static void scanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자(x)를 입력하세요");
		int x = Integer.parseInt(scanner.nextInt());
		System.out.println("x=" + x);

		System.out.println("두번쨰 숫자(y)를  입력하세요");
		int y =Integer.parseInt(scanner.nextInt());
		System.out.print("y=" + y);

		System.out.println("연산자(*또는/)를 입력하세요.");
		String op = scanner.nextLine();
		System.out.println("연산자="  +op);
		
		int result=0;
		System.out.println(x + " " + op + " " + y "=" +result);
		
		scanner.close();

	}

}
