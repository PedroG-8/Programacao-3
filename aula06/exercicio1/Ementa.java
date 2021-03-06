package aula06.exercicio1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Ementa {

	private final String nome;
	private final String local;
	private final HashMap <DiaSemana, LinkedList <Prato>> pratos = new HashMap<>();
	
	public Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void addPrato(Prato prato, DiaSemana dia) {
		if(pratos.containsKey(dia)) {
			pratos.get(dia).add(prato);
		}
		else {
			LinkedList <Prato> tmp = new LinkedList<>();
			tmp.add(prato);
			pratos.put(dia, tmp);
		}
	}
	
	public Prato[] getPratoPorDia(int d) {
		LinkedList <Prato> newList = pratos.get(DiaSemana.getDia(d));
		Prato[] tmp = new Prato[newList.size()];
		int i = 0;
		for(Prato p : newList.toArray(new Prato[0])) {
			tmp[i++] = p;
		}
		return tmp;
	}
	
	@Override
	public String toString() {
		String s = "";
		DiaSemana[] sorted = pratos.keySet().toArray(new DiaSemana[0]);
		Arrays.sort(sorted);
		for(DiaSemana dia : sorted) {
			LinkedList<Prato> list = pratos.get(dia);
			for(Prato p : list.toArray(new Prato[0])) {
				s += p.toString()+", dia "+dia+"\n";
			}
		}
		return s;
	}
}
