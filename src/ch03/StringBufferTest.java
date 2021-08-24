package ch03;

public class StringBufferTest {

	public static void main(String[] args) {

		/*
		 * String + String 연결시 HashCode 값이 동일
		 * 메모리 관리에 유리
		 * 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
		 */
		String java = new String("java");
		String android = new String("andriod");

		StringBuffer buffer = new StringBuffer(java);

		System.out.println(System.identityHashCode(buffer));

		buffer.append(android);

		System.out.println(System.identityHashCode(buffer));

		String test = buffer.toString();
		System.out.println(test);

	}

}
