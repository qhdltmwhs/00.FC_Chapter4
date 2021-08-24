package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * equals() 와 hashCode() 메서드 이해하기
		 */
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");

		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));

		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Integer i = 100;
		System.out.println(i.hashCode());

		/*
		 * 객체의 본래 hashCode 값 hashCode() 메서드 
		 * 재정의 하여도 가지고있는 고유의 값
		 */
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		/*
		 * clone() 메서드는 객체 생성과 는 다르다.
		 * 객체의 초기값이 아닌 현재상태(변경된부분있다면 적용됨)를 복사한다.
		 * clone() 메서드를 사용하려는 객체의 클래스는 반드시 명시적으로 
		 * implements Cloneable 작성해야하며, clone() 메서드를 재정의 해야된다. 
		 */
		std1.setStudentName("모네");
		Student copyStudent = (Student) std1.clone();
		System.out.println(copyStudent);
		
	}

}
