package section26_IO_STREAMS;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\application & hallticket\\Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Employee emp = (Employee) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee SSN: " + emp.ssn);

	}

}
