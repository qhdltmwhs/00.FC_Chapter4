package ch03;

public class StringBiulderTest {

	public static void main(String[] args) {

		/*
		 * String + String 연결시 HashCode 값이 동일
		 * 메모리 관리에 유리
		 * 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장
		 */
		String java = new String("java");
		String android = new String("andriod");

		StringBuilder buffer = new StringBuilder(java);

		System.out.println(System.identityHashCode(buffer));

		buffer.append(android);

		System.out.println(System.identityHashCode(buffer));

		String test = buffer.toString();
		System.out.println(test);

	}

}
