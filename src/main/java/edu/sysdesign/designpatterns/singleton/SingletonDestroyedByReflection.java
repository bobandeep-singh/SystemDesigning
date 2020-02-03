package edu.sysdesign.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroyedByReflection {

	public static void main(String[] args) {
		SingletonWithEagerInitialization instanceOne = SingletonWithEagerInitialization.getInstance();
		System.out.println("Hash code of first instance: "+instanceOne.hashCode());


		SingletonWithEagerInitialization instanceTwo = null;
		try {
			Constructor[] constructors = SingletonWithEagerInitialization.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);

				instanceTwo = (SingletonWithEagerInitialization) constructor.newInstance();
				break;

			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hash code of second instance created using reflection: "+instanceTwo.hashCode());

	}

}
