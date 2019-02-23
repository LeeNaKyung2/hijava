package hijava.basic;

import java.util.HashMap;
import java.util.Map;


public class Hash {
	public static void main(String[] args) {
		maps();
	}

	private static void maps() {
		Map<Integer, Student> map = new HashMap<>();
		Student s1 = new Student(100, "hong1");
		Student s2 = new Student(200, "honh2");
		Student s3 = new Student(300, "hong3");

		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		System.out.println(map);

		int searchId = 301;
		if (map.containsKey(searchId)) {
			Student s200 = map.get(searchId);
			System.out.println(s200.getName());
		} else {
			System.out.println(searchId + "학생이 없습니다!!");
		}
	}
}
