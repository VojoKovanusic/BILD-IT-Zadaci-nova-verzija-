package zadaci_14_03_2017;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ZadatakBr5_deep_copy {
	public static void main(String[] args) throws CloneNotSupportedException {

		MyStack stack = new MyStack();
		stack.push("sd");
		stack.push("2");
		stack.push('d');
		stack.push("1");
		stack.push("23");
		stack.push(75);
		MyStack stack2 = (MyStack) stack.clone();
		System.out.println("Br elemenata stack: " + stack.getSize());
		System.out.println("Br elemenata stack2: " + stack2.getSize());
		stack.push("jos");
		stack.push("sd");
		stack.push("2");
		stack.push('d');
		System.out.println("Br elemenata stack: " + stack.getSize());
		System.out.println("Br elemenata stack2: " + stack2.getSize());
		
	}

	public static Object deepClone(Object object) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			ByteArrayInputStream bais = new ByteArrayInputStream(
					baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
