package hijava.opp;


import java.util.ArrayList;

import hijava.practice.Man;

public class Main {
	
	public static void main(String[] args) {
//		calcoper();
//		total();
//		calculator();
//		software();
//		netsport();
//		animal();
		
//		drinkTest();
		
//		al();
//		Mom mom = new Mom();
//		Son son = new Son();
		
//		mom.eat();
//		son.eat();
		
//		mom.say();
//		son.say();
//	}
	
//	private static void al() {
//		ArrayList<Man>people = new ArrayList<>(9);
//		java.util.ArrayList<Man>people = new ArrayList<>(9);
		
		for(int i = 0; i < 9; i++) {
			Man m = new Man("김" +(i+1)+ "수");
			m.buyCoffee(1);
			
//			people.add(m);
		}
		
//		int size = people.size();
//		for(int i = 0; i < size; i++) {
//			System.out.println(people.get(i));
		}


	private static void calcoper() {
		int x = 10, y = 5;
		CalcOper op = new CalcOper();
		int a = op.add(x, y);
		int s = op.sub(x, y);
		System.out.println(a + "," + s);

		op.mul(x, y);
		op.div(x, y);
	}

	private static void total() {
		int[] arr= new int[] {1,2,5,9};
		SubTotal st = new SubTotal();
		System.out.println("Total="+st.sum(arr));
	}


	private static void calculator() {
		Calculator clac = new CalculatorImpl();
		int x = 10,y = 5;
		calc.add(x,y);
		calc.sub(x,y);
		
	}


	private static void software() {
		SoftWare we = new Website();
		SoftWare mo = new MobilApp();
		we.product();
		mo.product();
		
		
	}


	private static void netsport() {
		NetSport pp = new PingPong();
		NetSport te = new Tennis();
		pp.play();
		System.out.println("---------------");
		te.play();
	}


	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}
	
	private static void barkAnimal(Animal ani) {
		ani.bark();
	}


	private static void drinkTest() {

		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
	}

	private static void drink(Mom m) {
		if(m instanceof Son) {
			((Son)m).drinkMilk();
		}
		else{	
			m.drinkBeer();
		}
		}
			
		}
//	}
	

//}