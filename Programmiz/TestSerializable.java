import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "David";
		e.address = "1120 Wien";
		e.SSN = 1123546132;
		e.number = 102;

		try {
			FileOutputStream fileOut = new FileOutputStream(new File("employee.ser"));
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data saved in employee.ser");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
