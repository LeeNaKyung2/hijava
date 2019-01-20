package hijava.practice;

public class stack {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i <= num; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int num) {
//		if(num<=1)return num;

		if (num > 1)
			return fibo(num - 1) + fibo(num - 2);
		else
			return num;

	}
}
