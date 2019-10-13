package aula09.exercicio1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class ScannerAbeirense implements Iterator<String>, Closeable {

	Scanner kb;
	
	public ScannerAbeirense(InputStream i){
		kb = new Scanner(i);
	}
	
	public ScannerAbeirense(String a) {
		kb = new Scanner(a);
	}
	
	public ScannerAbeirense(File f) {
		try {
			kb = new Scanner(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void close() {
		kb.close();
	}

	@Override
	public boolean hasNext() {
		return kb.hasNext();
	}

	@Override
	public String next() {	
		String s = kb.nextLine();
		s = s.replaceAll("v", "b");
		s = s.replaceAll("V", "B");
		return s;
	}
}


