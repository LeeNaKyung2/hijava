package hijava.opp;


import java.util.ArrayList;

import hijava.practice.Man;

public class Main {
	
	public static void main(String[] args) {
		
		drinkTest();
		
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