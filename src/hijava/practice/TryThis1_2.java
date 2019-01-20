package hijava.practice;

public class TryThis1_2 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(++i<=100) {
			
			if(i%2 == 0)
				continue;
			
			sum=sum+i;
		}	
			System.out.println(sum);			
				
			}
	}
