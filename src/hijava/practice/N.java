package hijava.practice;

public class N {
	int x=10;
	int y=20;
	int z;

	public void swap() {
		z=x;
		x=y;
		y=z;
		
		
		}
	
	public static void main(String[] args) {
		N n=new N();
		
//		n.x�� n�ӿ� x�� ����ִٴ� ���̴�.
		System.out.println("x="+n.x);
		System.out.println("y="+n.y);
		n.swap();
		System.out.println("x=" +n.x);
		System.out.println("y=" +n.y);
		
	
		}

	}


