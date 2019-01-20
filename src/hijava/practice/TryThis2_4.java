package hijava.practice;

public class TryThis2_4 {

	public static void main(String[] args) {
		int line = 4;
		for(int i=1;i<=line; i++) {
			
		for(int j =1; j<=(line-i); j++) {
			System.out.print(' ');
		}
		
		for(int k=1; k<(2*i-1);k++) {
			System.out.print('*');
		}
		System.out.println();
	}
	}
}

	
