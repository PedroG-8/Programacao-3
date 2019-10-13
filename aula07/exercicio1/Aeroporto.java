package aula07.exercicio1;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Aeroporto {

	private List<Voo> voos = new ArrayList<>();
	private HashMap<String, Companhia> comp = new HashMap<>();
	
	public Aeroporto(String companhiasFile, String voosFile) throws IOException {
		List<String> infoCompanhias = Files.readAllLines(Paths.get(companhiasFile));
		List<String> info = Files.readAllLines(Paths.get(voosFile));
			
		for(int i = 0; i < infoCompanhias.size(); i++) {
			if(i == 0) continue;
			String[] lineSplit = infoCompanhias.get(i).split("\t");
			comp.put(lineSplit[0], new Companhia(lineSplit[0],lineSplit[1]));
		}
			
		for(int i = 0; i < info.size(); i++) {
			if(i == 0) continue;
			String[] lineSplit = info.get(i).split("\t");
			Companhia company = comp.get(lineSplit[1].substring(0,2));
			if(company == null) {
				continue;
			}
			Hora delay = lineSplit.length < 4 ? new Hora() : new Hora(lineSplit[3]);
			addVoo(new Voo(new Hora(lineSplit[0]), lineSplit[1], company, lineSplit[2], delay));
			}	
		}
		
	public void printAtrasos() {
		HashMap<Companhia,Integer> tabelaAtrasos = new HashMap<>(); 
		System.out.println("Companhia\t\tAtraso");
		for(Companhia companhia : comp.values().toArray(new Companhia[0])) {
			int sum = 0;
			int count = 0;
			for(Voo voo : voos.toArray(new Voo[0])) {
				if(voo.getCompanhia() == companhia) {
					sum += voo.getAtrasoMins();
					count++;
				}
			}
			tabelaAtrasos.put(companhia,new Integer((int)((float)sum/(float)count)));
		}
			
		Companhia[] sortedCompanhias = tabelaAtrasos.keySet().toArray(new Companhia[0]);
		Arrays.sort(sortedCompanhias, new Comparator<Companhia>() {
			@Override
			public int compare(Companhia o1, Companhia o2) {
				return tabelaAtrasos.get(o1)-tabelaAtrasos.get(o2);
			}	
		});
		for(Companhia companhia : sortedCompanhias) {
			System.out.printf(String.format("%-18s\t%s\n", companhia, new Hora(tabelaAtrasos.get(companhia))));
		}
	}
		
	public void printToScreen() {
		System.out.println("Hora\tVoo\t\tCompanhia\t\tOrigem\t\t\tAtraso\tObs");
		for(Voo voo : voos.toArray(new Voo[0])) {
			System.out.println(voo);
		}
	}
		
	public String voosToString() {
		String str = "";
		for(Voo voo : voos.toArray(new Voo[0])) {
			str += voo + "\n";
		}
		return str;
	}
		
	public boolean writeToFile(String filename) throws IOException {
		Files.write(Paths.get(filename), voosToString().getBytes());
		return true;
	}
		
	public boolean addVoo(Voo voo) {
		return voos.add(voo);
	}

	public boolean writeToBinaryFile(String path) throws IOException {
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		file.write(voosToString().getBytes());
		file.close();
		return true;
	}
		
	public boolean readFromBinaryAndPrint(String path) throws IOException {
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		byte[] info = new byte[(int)file.length()];
		file.readFully(info);
		file.close();
		System.out.println(new String(info));
		return true;
	}
}	

