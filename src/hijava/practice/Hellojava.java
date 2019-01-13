package hijava.practice;

/**
 * 첫번째 자바 실습
 * 
 * @author 60312
 * @UPDATE say함수추가
 */

public class Hellojava {

	public static void main(String[] args) {
//		Hello java에게 say라는 명령을 내림
		Hellojava.say("Hi~");

//	    JVM이 스스로 화면에 출력
		System.out.println("Hello java!!");

	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}
