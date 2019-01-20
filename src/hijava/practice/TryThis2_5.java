package hijava.practice;

public class TryThis2_5 {

	public static void main(String[] args) {
		int total = 0;
		// 1은 소수가 아니니까 2부터 시작
		for (int i = 2; i <= 100; i++) {
			// 2를 이미소수라고 판단한경우니까 true
			boolean isprime = true;

			for (int j = 2; j <= (i - 1); j++) {

				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			
			if (isprime)
				total = total + i;
		}
		
		System.out.println(total);
	}
}
// boolean이 true인 경우에 더해준다 
//i가j로 나눠질 경우 break로 두번째 for문 빠져나와 다시 첫번째 for 문 실행
