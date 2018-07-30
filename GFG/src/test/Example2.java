package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Exam implements Serializable{
	public int i;
	
	Exam(int i){
		this.i=i;
	}
	
	public Exam() {
		
	}
}

public class Example2 extends Exam  {
	int j;
	Example2(int i,int j) {
		super(i);
		this.j=j;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("abc.ser")));
		out.writeObject(new Example2(2,4));
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("abc.ser")));
		Example2 ex = (Example2) in.readObject();
		System.out.println(ex.i);
		System.out.println(ex.j);
	}
}
