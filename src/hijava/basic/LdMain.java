package hijava.basic;

public class LdMain {

	public static void main(String[] args) {
//		ld1();
		ld2();
	}

	private static void ld2() {
		LdSi add = (x, y) -> x+y;
		LdSi sub = (x, y) -> x-y;
		LdSi mul = (x, y) -> x*y;
		LdSi div = (x, y) -> x/y;
		
		System.out.println("add=" +add.oper(10, 20));
		System.out.println("sub=" +sub.oper(10, 20));
		System.out.println("mul=" +mul.oper(10, 20));
		System.out.println("div=" +div.oper(10, 20));
	}

	private static void ld1() {
		LdStudent ls1 = (i, s) -> new Student(i, s);
		Student stu1 = ls1.makeStudent(100, "Hong");
		System.out.println(stu1);
		
		LdStudent ls2 = (i, s) -> new Student(i*1000, s+"님");
		Student stu2 = ls2.makeStudent(200, "Kim");
		System.out.println(stu2);
	
	}
}
