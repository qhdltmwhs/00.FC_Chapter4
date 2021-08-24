package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * Class란 클래스 이해하기 Class.forName()사용하여 
		 * 컴파일시 가 아닌 런타임시 객체 동적 바인딩 가능
		 */
		Class c = Class.forName("java.lang.String");

		Constructor[] constructors = c.getConstructors();
		Method[] methods = c.getMethods();

		for (Constructor co : constructors) {
			System.out.println(co);
		}

		for (Method m : methods) {
			System.out.println(m);
		}

	}

}
