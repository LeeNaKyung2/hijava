package hijava.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		//test1();
		//test2();
		//tryThis();
		test3();

	}

	private static void test3() {
		try(FileInputStream fis = new FileInputStream("test.txt")){
			System.out.println("0000000000000000000");
		}catch (FileNotFoundException e) {
			System.out.println("test.txt파일이없어요!!");
		}catch (IOException e) {
				e.printStackTrace();
			}
		}

	private static void tryThis() {
			List<Student> students = new ArrayList<>();
			students.add(new Student(90,"홍길동"));
			students.add(new Student(80,"길일수"));
			students.add(new Student(75,"김이수"));
			students.add(new Student(95,"김삼수"));
			
			//1
			students.forEach(s -> System.out.println("1=" +s.getName()));
			
			//2
			Student[]arr=new Student[students.size()];
			students.toArray(arr);
			
			int sum = Arrays.stream(arr).mapToInt(s-> s.getId()).sum();
			double avg = Arrays.stream(arr).mapToInt(s-> s.getId()).average().getAsDouble();
			System.out.println("sum=" +sum+",avg="+avg);
			
			//3
			Arrays.stream(arr).filter(s -> s.getId()>=90).sorted().forEach(s -> System.out.println(s));
			
		
	}

	private static void test2() {
		int[] arr = new int[] {2,3,1,5,3,2};
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg=" +avg);
		
		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" +n));
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));
		
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDist=" +n));
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));
		
		System.out.println("----------------------");
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));
		

	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Hong20"));
		students.add(new Student(5, "Hong5"));

		System.out.println(students);
		System.out.println("-----------------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);
	}
}
