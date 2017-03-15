package zadaci_14_03_2017;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyStack implements Cloneable,Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	 
	public MyStack clone() {
		MyStack clone = new MyStack();
		for (Object obj : this.list) {
			clone.push(copy(obj));
		}
		return clone;
	}

	/**
	 * method for deep copying the object
	 * 
	 * @param original
	 *            object to copy
	 * @return copy of the object
	 */
	public static Object copy(Object original) {
		Object objectCopy = null;
		try {
			// Write the object out to a byte array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(original);
			out.flush();
			out.close();

			// Make an input stream from the byte array and read
			// a copy of the object back in.
			ObjectInputStream
			in = new ObjectInputStream(
					new ByteArrayInputStream(bos.toByteArray()));
			objectCopy = in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return objectCopy;
	}

}