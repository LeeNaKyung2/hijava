package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student implements Cloneable {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student clobj = (Student) super.clone();
		clobj.name = clobj.name + "복제본!";
		return clobj;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// 동일한 메모리 주소면 true
		if (this == obj)
			return true;

		// this는 절대 null이 될 수 없으므로 obj null이면 false!!
		if (obj == null)
			return false;

		// 동일한 class type이 아니면 false
		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (this.id != other.id)
			return false;

		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		return true;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(921234, "홍길동");
//		Student s2=(Student)s.clone();
//		System.out.println(s2);
//		System.out.println(s.getClass()+","+s.getClass().getSimpleName());
		
		String inputStr = "hijava.basic.Student";
		Class cls = Class.forName(inputStr);
		Package pkg = cls.getPackage();
		System.out.println("pkg="+pkg);
		
		for (Constructor c: cls.getConstructors())
			System.out.println(c);
		for (Field f : cls.getFields())
			System.out.println(f);
		for (Method m : cls.getMethods())
			System.out.println(m.getName());
		
		

		boolean hasCondition = true;
//		String searchStr = "홍길동";
//		String s = "select * from Tb1";
//		if (hasCondition) {
//			s = s + "where name like '%" + searchStr + "%";
//			s += "and id>0";
//			s += "limit10";
		}
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("select * from Tb1");
//		if (hasCondition) {
//			sb.append("where name like '%").append(searchStr).append("%");
//			sb.append(100).append('T');
//		}
//		System.out.println(s);
//		String ss = new String("홍길동1");
//		Integer obj = new Integer(s.id);
//		Integer obj2 = new Integer(921234);
//		System.out.println(s.name.hashCode() + "::" + ss.hashCode());
//		System.out.println(obj.hashCode() + "=" + obj2.hashCode());
//		System.out.println(System.identityHashCode(obj2));

//		Student s1 = new Student(123, "Hong");
//		Student s2 = new Student(456, "Kim");
//		Student s3 = new Student(123, "Hong");
//	    System.out.println("s1 equals s2=" + s2.equals(s1));
//		System.out.println("s1 equals s3=" + s3.equals(s1));
	}
//}
