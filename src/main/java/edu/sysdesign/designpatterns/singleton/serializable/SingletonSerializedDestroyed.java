package edu.sysdesign.designpatterns.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedDestroyed {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonSerialized instanceOne = SingletonSerialized.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerialized.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInput input = new ObjectInputStream(new FileInputStream("SingletonSerialized.ser"));
		
		SingletonSerialized instanceTwo = (SingletonSerialized) input.readObject();
		
		System.out.println("First instance has code: "+instanceOne.hashCode());
		System.out.println("Second instance has code: "+instanceTwo.hashCode());
	}
}
