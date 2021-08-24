package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		/*
		 * Class 클래스로 객체 생성하기 new 객체() 와 같다.
		 */

		/*
		 * 1. Stirng 값으로 객체생성 Class.forName() 스택틱 메서드
		 */
		Class c1 = Class.forName("ch04.Person");
		
		Person personL = (Person) c1.newInstance();
		personL.setName("Lee");
		System.out.println(personL);

		/*
		 * 2. 객체.getClass() 메서드로 새로운 객체생성 이미 생성된 객체가 존재해야 가능
		 */
		Class c2 = personL.getClass();
		Person personN = (Person) c2.newInstance();
		System.out.println(personN);
		
		/*
		 * 3.생성자(constructor)를 사용한 객체 생성
		 */
		Class[] parameterTypes = { String.class };
		Constructor constructor = c1.getConstructor(parameterTypes);

		Object[] initargs = { "Kim" };
		Person personK = (Person) constructor.newInstance(initargs);
		System.out.println(personK);
		
	}

}
