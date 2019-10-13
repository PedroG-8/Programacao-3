package classes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectStream 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		// Escrever para o ficheiro
		FileOutputStream out = new FileOutputStream("src/classes/Time.txt");
		ObjectOutputStream s = new ObjectOutputStream(out);
		s.writeObject("Today");
		s.writeObject(new Date());
		s.flush();
		s.close();
		
		// Ler do ficheiro
		FileInputStream in = new FileInputStream("src/classes/Time.txt");
		ObjectInputStream s2 = new ObjectInputStream(in);
		String today = (String)s2.readObject();
		Date date = (Date)s2.readObject();
		System.out.println(today + ": " + date);
		s2.close();
	}

}
