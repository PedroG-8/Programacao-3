package classes;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) {
		String[] workers = {"Bob Marley", "Joao Mario", "Maria das Couves", "Ana Roberta", "Rita Silva", "Filipa Sousa", 
				"Pedro Miguel", "Diogo Maria", "Paulo Marques"};
		
		ArrayList<String> names = new ArrayList<String>();
		Arrays.stream(workers).forEach(x -> names.add(x));
		System.out.println(names);
		
	}

}
